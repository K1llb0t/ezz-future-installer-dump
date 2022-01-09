/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N1;
import net.futureclient.installer.NH;
import net.futureclient.installer.TH;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class EK {
    public final /* synthetic */ int u;
    public final /* synthetic */ byte[] H;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ long a;

    public /* synthetic */ EK(byte[] arrby, int n2) {
        EK eK = this;
        eK.H = arrby;
        eK.u = n2;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ String toString() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[SWITCH]
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
        a = wu.a(1066688989815433182L, 8227336592474168953L, MethodHandles.lookup().lookupClass()).a(34896729672274L);
        long l2 = a ^ 0x840D780B0E5L;
        Cipher cipher = Cipher.getInstance(TH.C("}wm\u001ahbe\u0002vflw\rc\u0005\u000bkmom"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(NH.C("h#5"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = EK.a(cipher.doFinal(TH.C("q\u001cDH\u0003\u008f\u00c6#k\u0092\u00e2\u0094\u0086x2\u00ec\u00d78\n%\u00c3.%\u00c4Q`\u00f2\u00c4\u0081\u001e\u00de8\u00d4\u008f\u00bakIB\u00ad\r").getBytes(NH.C("xby\u001b\t\t\u0019\u0015KW")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ N1 q(Object[] this_) {
        DataInputStream dataInputStream;
        Object object;
        long l2;
        block14: {
            l2 = (Long)this_[0];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x7DBA4E466B49L;
            long l4 = l2 ^ 0x41E4B34ADA38L;
            long l5 = l2 ^ 0x5551890F017EL;
            long l6 = l2 ^ 0x64A69FD99B83L;
            Object[] arrobject = new Object[2];
            arrobject[1] = l6;
            arrobject[0] = b;
            object = ye.a("G", (Object)arrobject, (long)-9190708890157061848L, (long)l2);
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l5;
            dataInputStream = new DataInputStream((InputStream)((Object)ye.a("G", (Object)((Path)((Object)ye.a("G", (Object)arrobject2, (long)-9044118682550949652L, (long)l2))), (Object)new OpenOption[0], (long)-9077582733121930006L, (long)l2)));
            Throwable throwable = null;
            CallSite callSite = ye.a("G", (long)-9073851214245793936L, (long)l2);
            try {
                Object[] arrobject3 = new Object[2];
                arrobject3[1] = l3;
                arrobject3[0] = dataInputStream;
                CallSite callSite2 = ye.a("G", (Object)arrobject3, (long)-9074773166727357952L, (long)l2);
                Object[] arrobject4 = new Object[2];
                arrobject4[1] = l3;
                arrobject4[0] = dataInputStream;
                Object[] arrobject5 = new Object[4];
                arrobject5[3] = callSite2;
                arrobject5[2] = object;
                arrobject5[1] = l4;
                arrobject5[0] = ye.a("G", (Object)arrobject4, (long)-9074773166727357952L, (long)l2);
                CallSite callSite3 = ye.a("G", (Object)arrobject5, (long)-9196168946514846166L, (long)l2);
                Object[] arrobject6 = new Object[2];
                arrobject6[1] = l3;
                arrobject6[0] = dataInputStream;
                Object[] arrobject7 = new Object[4];
                arrobject7[3] = callSite2;
                arrobject7[2] = object;
                arrobject7[1] = l4;
                arrobject7[0] = ye.a("G", (Object)arrobject6, (long)-9074773166727357952L, (long)l2);
                object = ye.a("G", (Object)arrobject7, (long)-9196168946514846166L, (long)l2);
                object = new N1(new String((byte[])callSite3, (Charset)((Object)ye.a("Z", (long)-9048572684469346101L, (long)l2))), new String((byte[])object, (Charset)((Object)ye.a("Z", (long)-9048572684469346101L, (long)l2))));
            }
            catch (Throwable throwable2) {
                try {
                    Throwable throwable5 = throwable2;
                    throwable = throwable2;
                    throw throwable5;
                }
                catch (Throwable throwable6) {
                    Throwable throwable3;
                    block12: {
                        block13: {
                            try {
                                if (callSite == null) break block12;
                                if (throwable == null) break block13;
                            }
                            catch (Throwable throwable4) {
                                throw (Throwable)((Object)ye.a("G", (Object)throwable4, (long)-8954545698668887715L, (long)l2));
                            }
                            try {
                                ye.a("j", (Object)dataInputStream, (long)-9189905979340485661L, (long)l2);
                            }
                            catch (Throwable throwable9) {
                                ye.a("j", (Object)throwable, (Object)throwable9, (long)-9070439853328986775L, (long)l2);
                                throwable3 = throwable6;
                                throw throwable3;
                            }
                        }
                        ye.a("j", (Object)dataInputStream, (long)-9189905979340485661L, (long)l2);
                    }
                    throwable3 = throwable6;
                    throw throwable3;
                }
            }
            try {
                if (callSite == null) return object;
                if (throwable == null) break block14;
            }
            catch (Throwable throwable5) {
                throw (Throwable)((Object)ye.a("G", (Object)throwable5, (long)-8954545698668887715L, (long)l2));
            }
            try {
                ye.a("j", (Object)dataInputStream, (long)-9189905979340485661L, (long)l2);
                return object;
            }
            catch (Throwable throwable3) {
                ye.a("j", (Object)throwable, (Object)throwable3, (long)-9070439853328986775L, (long)l2);
                return object;
            }
        }
        ye.a("j", (Object)dataInputStream, (long)-9189905979340485661L, (long)l2);
        return object;
    }

    private static /* synthetic */ byte[] L(Object[] this_) {
        DataInputStream dataInputStream = (DataInputStream)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        byte[] arrby = new byte[ye.a("j", (Object)dataInputStream, (long)-8969061828304823040L, (long)l2)];
        ye.a("j", (Object)dataInputStream, (Object)arrby, (long)-9211801455725856770L, (long)l2);
        return arrby;
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

