/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.TH;
import net.futureclient.installer.Th;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Ne {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ int Q;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x7B75;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(TH.C("}wm\u001ahbe\u0002vflw\rc\u0005\u000b`fAC"));
                    arrobject[1] = SecretKeyFactory.getInstance(Th.C("\u0001H="));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(TH.C("A[AK\tV\\Q]\\QR\\NNR\u0002OC\\PY_\b\nv aA"), exception);
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
            byte[] arrby2 = b[n2].getBytes(Th.C("D=UT~\u001d\u0013| _"));
            Ne.c[n2] = Ne.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ boolean f(Object[] this_) {
        Object object;
        block4: {
            long l2 = (Long)this_[0];
            l2 = a ^ l2;
            CallSite callSite = ye.a("G", (long)-1174176345589841193L, (long)l2);
            try {
                object = ye.a("Z", (long)-1248333686234913837L, (long)l2);
                if (callSite == null) return (boolean)object;
                if (object < 9) break block4;
                return true;
            }
            catch (NumberFormatException numberFormatException) {
                try {
                    throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-1277010191080679037L, (long)l2));
                }
                catch (NumberFormatException numberFormatException2) {
                    throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException2, (long)-1277010191080679037L, (long)l2));
                }
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ int c(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
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
     * Exception decompiling
     */
    private static /* synthetic */ int S(Object[] this) {
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Ne.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    public static /* synthetic */ int n(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        return (int)ye.a("Z", (long)-2430122653406768328L, (long)l2);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ {
        int n2;
        block6: {
            CallSite callSite;
            block5: {
                int n3;
                a = wu.a(-3792829818486160767L, -4783018573162715515L, MethodHandles.lookup().lookupClass()).a(76557520560268L);
                long l2 = a ^ 0x3EEE49AF32B3L;
                long l3 = l2 ^ 0x1A6031004864L;
                long l4 = l2 ^ 0x2BF083C42857L;
                d = new HashMap(13);
                Cipher cipher = Cipher.getInstance(TH.C("}wm\u001ahbe\u0002vflw\rc\u0005\u000b`fAC"));
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Th.C("\u0001H="));
                byte[] arrby = new byte[8];
                byte[] arrby2 = arrby;
                arrby[0] = (byte)(l2 >>> 56);
                int n4 = n3 = 1;
                while (n4 < 8) {
                    arrby2 = arrby2;
                    int n5 = n3++;
                    arrby2[n5] = (byte)(l2 << n5 * 8 >>> 56);
                    n4 = n3;
                }
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                String[] arrstring = new String[2];
                int n6 = 0;
                String string = TH.C("9/lo\u00be\u0011@M\u00ad\u001a\u0005\u00d9(\u00f7k\u00c0\b\u0087_V\u001a\u008c\u0017\u00d1k\u00cb\u0086\u00a9c]\u001fc{}\u00b9\u00ea\u00c0\u008d\u00c7m\u0097\u00a3\u000b\u00e9~6)\u008d\u001d");
                int n7 = string.length();
                int n8 = 16;
                n3 = -1;
                while (true) {
                    char c2;
                    int n9 = ++n3;
                    arrstring[++n6] = Ne.a(cipher.doFinal(string.substring(n9, n9 + c2).getBytes(Th.C("D=UT~\u001d\u0013| _")))).intern();
                    if ((n3 += c2) >= n7) break;
                    c2 = string.charAt(n3);
                }
                b = arrstring;
                c = new String[2];
                String string2 = (String)((Object)ye.a("G", (String)((Object)Ne.a("b", (int)17979, (long)(0x6B43CC9DF337039AL ^ l2))), (long)-4778282988897113416L, (long)l2));
                Object[] arrobject = new Object[2];
                arrobject[1] = l4;
                arrobject[0] = string2;
                CallSite callSite2 = ye.a("G", (Object)arrobject, (long)-4870292730323919849L, (long)l2);
                if (callSite2 == -1) {
                    Object[] arrobject2 = new Object[2];
                    arrobject2[1] = string2;
                    arrobject2[0] = l3;
                    callSite = ye.a("G", (Object)arrobject2, (long)-4889834654093789935L, (long)l2);
                }
                try {
                    if (callSite != -1) break block5;
                    n2 = 6;
                    break block6;
                }
                catch (NumberFormatException numberFormatException) {
                    throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-4882450971086861318L, (long)l2));
                }
            }
            n2 = callSite;
        }
        Q = n2;
    }
}

