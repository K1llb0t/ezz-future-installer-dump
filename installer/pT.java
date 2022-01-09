/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.L;
import net.futureclient.installer.N8;
import net.futureclient.installer.v6;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class pT
extends vA {
    private static final /* synthetic */ String a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void Z(Object[] object) {
        String string;
        long l2;
        long l3;
        L l4;
        block6: {
            Object object2;
            block4: {
                block5: {
                    l4 = (L)object[0];
                    l3 = (Long)object[1];
                    object = object[2];
                    l2 = l3 ^ 0x1F239A2408EEL;
                    CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l3);
                    object2 = object = (Boolean)object;
                    try {
                        if (callSite == null) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        try {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8273579105802791473L, (long)l3));
                        }
                        catch (RuntimeException runtimeException2) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)8273579105802791473L, (long)l3));
                        }
                    }
                    string = a;
                    break block6;
                }
                object2 = object;
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)8098229193797204003L, (long)l3));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l2;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l4, (Object)arrobject, (long)8326898731959281976L, (long)l3));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        long l2 = wu.a(8537077201916523198L, 8451407762663242108L, MethodHandles.lookup().lookupClass()).a(180100005272810L) ^ 0x5484700E1F50L;
        Cipher cipher = Cipher.getInstance(N8.C("\u0017_$\u0011\\\u0014\u0003&\u001fM\tPxT+g3ws3"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(v6.C("\u0001E2"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                a = pT.a(cipher.doFinal(N8.C("Wx\u00c7\u00c8\u00bf\u0097^\u00de").getBytes(v6.C("x\u0003ijB#\u0011|-P")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ Object i(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1030)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    private static /* synthetic */ String a(byte[] this_) {
        int n2;
        int n3 = 0;
        int n4 = this_.length;
        char[] arrc = new char[n4];
        int n5 = n2 = 0;
        while (n5 < n4) {
            char c2;
            int n6 = 0xFF & this_[n2];
            if (n6 < 192) {
                arrc[n3++] = (char)n6;
            } else if (n6 < 224) {
                c2 = (char)((char)(n6 & 0x1F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            } else if (n2 < n4 - 2) {
                c2 = (char)((char)(n6 & 0xF) << 12);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            }
            n5 = ++n2;
        }
        return new String(arrc, 0, n3);
    }
}

