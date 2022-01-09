/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.J;
import net.futureclient.installer.NN;
import net.futureclient.installer.NT;
import net.futureclient.installer.Tx;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class No
extends DataInputStream {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ String[] b;
    private /* synthetic */ NT s;
    private static final /* synthetic */ Map d;

    /*
     * Exception decompiling
     */
    public final /* synthetic */ Tx h(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x1C7C;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(NN.C(" L\"3?S?>%S!\\\u000b\u0003?W\u001b{\u001f{"));
                    arrobject[1] = SecretKeyFactory.getInstance(J.C("8X!"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(NN.C("g['Vr\u000bg\u0016|\u0001j\u001du\u0019\u007f\b>\u001cv\u0011{_?2V\r=?s"), exception);
            }
            byte[] arrby = new byte[8];
            object = arrby;
            arrby[0] = (byte)(l2 >>> 56);
            int n4 = n3 = 1;
            while (n4 < 8) {
                int n5 = n3++;
                object[n5] = (byte)(l2 << n5 * 8 >>> 56);
                n4 = n3;
            }
            DESKeySpec dESKeySpec = new DESKeySpec((byte[])object);
            object = ((SecretKeyFactory)arrobject[1]).generateSecret(dESKeySpec);
            ((Cipher)arrobject[0]).init(2, (Key)object, (IvParameterSpec)arrobject[2]);
            byte[] arrby2 = b[n2].getBytes(J.C("G2\u001d\u0010\ne&E0C"));
            No.c[n2] = No.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = No.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    public /* synthetic */ No(InputStream inputStream, String string, long l22) {
        l22 = a ^ l22;
        long l3 = l22 ^ 0x612DC48AD100L;
        int l22 = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        super(inputStream);
        No no = this;
        no.s = new NT(l22, (short)n2, string, n3);
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

    private static /* synthetic */ byte[] F(Object[] this_) {
        Object object;
        long l2;
        block4: {
            Object object2;
            block6: {
                Object object3;
                block5: {
                    object2 = (byte[])this_[0];
                    l2 = (Long)this_[1];
                    l2 = a ^ l2;
                    CallSite callSite = ye.a("G", (long)-3464257794059361649L, (long)l2);
                    Inflater inflater = new Inflater();
                    ye.a("j", (Object)inflater, (Object)object2, (long)-3586562202767340234L, (long)l2);
                    CallSite callSite2 = callSite;
                    object2 = new ByteArrayOutputStream(((byte[])object2).length);
                    byte[] arrby = new byte[1024];
                    block2: while (ye.a("j", (Object)inflater, (long)-3627607656528328443L, (long)l2) == false) {
                        CallSite callSite3 = ye.a("j", (Object)inflater, (Object)arrby, (long)-3601038608873737888L, (long)l2);
                        try {
                            object = object2;
                            if (l2 < 0L) break block4;
                            ye.a("j", (Object)object, (Object)arrby, (int)0, (int)callSite3, (long)-3462699952887304840L, (long)l2);
                            while (callSite2 != null) {
                                if (callSite2 != null) continue block2;
                                if (l2 <= 0L) continue;
                                object3 = object2;
                                break block5;
                            }
                            break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw (Exception)((Object)ye.a("G", (Object)runtimeException, (long)-3672730426434295338L, (long)l2));
                        }
                    }
                    object3 = object2;
                }
                ye.a("j", (Object)object3, (long)-3595923114651301871L, (long)l2);
            }
            object = object2;
        }
        return ye.a("j", (Object)object, (long)-3562729056694304374L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(3157721319607372693L, -166340534579994110L, MethodHandles.lookup().lookupClass()).a(10581549480758L);
        d = new HashMap(13);
        long l2 = a ^ 0x54F7A87E6196L;
        Cipher cipher = Cipher.getInstance(NN.C("\u001av,=o\u000301,Z:GKC\u0018p\u0000`@$"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(J.C("#\u0007~"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (n3 < 8) {
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        String[] arrstring = new String[3];
        int n5 = 0;
        String string = NN.C("z\u00dcSQ\u00d9\u0081(Pa\u00cax\u00cdm\u0092rnFo\u00d2q\u0000v\u00c9\u00b4\u00e1<\u00c2\u00f9\b\u00ba\u00fe\u009b\b\u00b1P\u001c\u0014\u00a6\u00d4\n/\u00f3\u00bf\u0011\u00ef\u0096[N\u00b3\u00ba\u00bf=\u00d6\u00f2\u001e8d\u00ca\u00afp\u00d8\u0014~\u00c7\u001c\u00b6\u00d3\u0098\u00ac\r\u000bI;\u0000i[\u00d7\u00de\"QzR\u00a4\u00a9#n\u00c5\u00f4=\u00da\u0098\u001a\u001a\u0011\u00e6bv\u00e0");
        int n6 = string.length();
        int n7 = 16;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = No.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[3];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ CallSite a(MethodHandles.Lookup this, String this, MethodType this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Expecting a ConstantPoolEntryLiteral or ConstantPoolEntryDynamicInfo
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackType(OperationFactoryLDC.java:37)
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDCW.getStackDelta(OperationFactoryLDCW.java:17)
         * org.benf.cfr.reader.bytecode.opcode.JVMInstr.getStackDelta(JVMInstr.java:315)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:195)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1542)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:400)
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
}

