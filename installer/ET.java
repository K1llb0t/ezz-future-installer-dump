/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Nu;
import net.futureclient.installer.Th;
import net.futureclient.installer.vU;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class ET {
    private static final /* synthetic */ long a;
    private final /* synthetic */ String s;
    private static final /* synthetic */ String b;
    private final /* synthetic */ vU o;
    private /* synthetic */ vU T;

    private /* synthetic */ vU P(Object[] object) {
        long l2 = (Long)object[0];
        l2 = a ^ l2;
        object = new vU(0);
        ET eT = this;
        ye.a("F", (Object)((vU)((Object)ye.a("\u00c3", (Object)eT, (long)-8480513395200568879L, (long)l2))), (vU)object, (long)-8383613042836228355L, (long)l2);
        ye.a("F", (Object)eT, (vU)object, (long)-8480513395200568879L, (long)l2);
        return object;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ String toString() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 9[CATCHBLOCK]
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

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-6533389040637456937L, -465527384560054753L, MethodHandles.lookup().lookupClass()).a(149294542954694L);
        long l2 = a ^ 0x3F9222AB66C1L;
        Cipher cipher = Cipher.getInstance(Nu.C("4W2,J)\u0015\u001b\tp\u001fmni=Z%Je\u000e"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Th.C("\ny\f"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = ET.a(cipher.doFinal(Nu.C("pt\u00d34\u0000+\u0007_").getBytes(Th.C("D=UT~\u001d\u0018w\u0011n")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    public final /* synthetic */ ET I(Object[] object) {
        long l2 = (Long)object[0];
        object = (String)object[1];
        long l3 = (Long)object[2];
        l2 = a ^ l2;
        long l4 = l2 ^ 0x1F00AD2E9A22L;
        Object[] arrobject = new Object[3];
        arrobject[2] = (String)((Object)ye.a("G", (long)l3, (long)4263842014245179182L, (long)l2));
        arrobject[1] = l4;
        arrobject[0] = object;
        return (ET)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)4288921471276261079L, (long)l2));
    }

    public final /* synthetic */ ET Y(Object[] object) {
        Object[] arrobject = object;
        object = (String)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x1B48B21028ACL;
        long l4 = l2 ^ 0x7F9F0FE11D6CL;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        vU vU2 = (vU)((Object)ye.a("\u00aa", (Object)this, (Object)arrobject2, (long)-9200931580989601638L, (long)l2));
        ye.a("F", (Object)vU2, (Object)object2, (long)-9064222784643729390L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l4;
        ye.a("F", (Object)vU2, (String)((String)((Object)ye.a("G", (Object)arrobject3, (long)-9031096040438921716L, (long)l2))), (long)-9143346385330669242L, (long)l2);
        return this;
    }

    public final /* synthetic */ ET S(Object[] object) {
        Object[] arrobject = object;
        object = object[0];
        long l2 = (Long)arrobject[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x4A843EE69783L;
        Object object2 = object;
        object = this;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        ye.a("F", (Object)((vU)((Object)ye.a("\u00aa", (Object)object, (Object)arrobject2, (long)4566905887390152629L, (long)l2))), (Object)object2, (long)4402893889992148797L, (long)l2);
        return object;
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

    private /* synthetic */ ET(String string, long l2) {
        l2 = a ^ l2;
        long l3 = l2 ^ 0x27A830FB948DL;
        this.o = new vU(0);
        this.T = this.o;
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l3;
        this.s = (String)((Object)ye.a("G", (Object)arrobject, (long)813535487727308781L, (long)l2));
    }

    public /* synthetic */ ET(String string, byte by, char c2, int n2, char c3) {
        long l2 = ((long)c2 << 48 | (long)n2 << 32 >>> 16 | (long)c3 << 48 >>> 48) ^ a ^ 0x58576CA62A13L;
        this(string, l2);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public final /* synthetic */ ET V(Object[] object) {
        long l2 = (Long)object[0];
        object = (String)object[1];
        int n2 = (Integer)object[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x793875DD2CD3L;
        Object[] arrobject = new Object[3];
        arrobject[2] = (String)((Object)ye.a("G", (int)n2, (long)-8192628659413540608L, (long)l2));
        arrobject[1] = l3;
        arrobject[0] = object;
        return (ET)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-8253926714501748698L, (long)l2));
    }
}

