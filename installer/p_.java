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
import net.futureclient.installer.EF;
import net.futureclient.installer.NC;
import net.futureclient.installer.Nk;
import net.futureclient.installer.Nu;
import net.futureclient.installer.pL;
import net.futureclient.installer.pn;
import net.futureclient.installer.vA;
import net.futureclient.installer.vq;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class p_
implements Nk {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;
    private final /* synthetic */ pn L;

    @Override
    public final /* synthetic */ vA V(Object[] object) {
        EF eF = (EF)object[0];
        long l2 = (Long)object[1];
        object = (pL)object[2];
        long l3 = l2 ^ 0x3D6FF0208174L;
        vq vq2 = (vq)((Object)ye.a("j", (Object)((Class)((Object)ye.a("\u00c3", (Object)object, (long)110292910009429894L, (long)l2))), vq.class, (long)33345918303378267L, (long)l2));
        try {
            if (vq2 == null) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)124896894433079450L, (long)l2));
        }
        Object[] arrobject = new Object[5];
        arrobject[4] = l3;
        arrobject[3] = vq2;
        arrobject[2] = object;
        arrobject[1] = eF;
        arrobject[0] = (pn)((Object)ye.a("\u00c3", (Object)this, (long)16014448300509796L, (long)l2));
        return (vA)((Object)ye.a("G", (Object)arrobject, (long)75942122449104648L, (long)l2));
    }

    public /* synthetic */ p_(pn pn2) {
        this.L = pn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x4C4D;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Nu.C("\u0005f\u0007\u0019\u001ay\u001a\u0014\u0000y\u0004v.)$C\u000ea:Q"));
                    arrobject[1] = SecretKeyFactory.getInstance(NC.C("\u001f^6"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Nu.C("M~\rsX.M3V$@8_<U-\u00149\\4Qz\u0015)B\u0018'$i"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NC.C("A%\u001b\u00072L\u0010b6T"));
            p_.c[n2] = p_.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
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

    private static /* synthetic */ IllegalArgumentException a(IllegalArgumentException this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ vA N(Object[] this) {
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
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(1308951535094078227L, 7096436909993476165L, MethodHandles.lookup().lookupClass()).a(166694919566024L);
        d = new HashMap(13);
        long l2 = a ^ 0x22A0F23816DAL;
        Cipher cipher = Cipher.getInstance(Nu.C("\u0001b9'J)\u0015\u001b\tp\u001fmni=Z%Je\u000e"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(NC.C("4\u0001i"));
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
        String string = Nu.C("l\u00b3\u008d\u0013\u00c8\u00f1o\u008b\u00ac\u00d48\u00b1;?\u00a1\u00b6\u00a3\r\u009fD+\u00a6\u00de\u00dd\r\u00f2\u00d7\u0019\u00f4-8#+m\u008aU\u00bb\u0082w\u00db\u00f1\u00f1\u00e0\u00e2\u00ba\u0082\u00a2\u00aa\u009bE!5Dr\u00fd\u00e7d\u00be+E\u00ab\u00e6\u00b5*\u00a9Q\u0092\u0091\u00ab\u009b\u0004\u00ff\u00c4\u00f6|\u0000\u00d7d~\u0005\u00e4^\u00f38\u0011\u00f3\u009f\u00bd\u0010\u0003\u00e1\u0095\u008d\u00a6;\u0099\u00b2z\u00a61\u009arE\u0083\u00a6\u00dew\u0016\u0090\u00d8\u00c2\u00b5\no\u00a7\u0011\u00df`=\u00d6\u00d7<\u008b\u007fd\u0016j\u000e\u0010Q\u00d7\u0094\u00ec\u00cdH\u00f4\u0014\u001f\u00a8E7U\u0084\u00dfb_$+\u00d69L\u00e3\u00f7s\u00b5u\u009a\u0083\u00f37\u00b7\u00ccq\u0018\u00f5\u00ee4) p\u0000\u0019\u001dE1v\u0095\u008d<w\u00ba\u00df\u0084\u00a4\u00df\u00c2N\u00cc \u0093\u0084h\u009b?\u00d2\u0001;H`\"\f\u009e\u00f3<1\u0000g\u00c8\u00f4q\u00f8\u00b4R\u00d0\u00a9\u00ef\u0011lF\tp<\u00e0\u00a0c\u001b\u009fmH\u0084\u00a9\u0095~\u00fe\u00eb5\u00c8\u0092A\u00d5\u00f5H\u0003(Z0\u00b0\u00bb%Q\u001c\u0099c(\u008a\u00ab\u00f2P\u00f1<\u0086\u00e3A,7\u00ec\u00c0\u00e6\u0095\"\u00b1\u0019\u0012\u00f2");
        int n6 = string.length();
        int n7 = 40;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = p_.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[3];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = p_.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
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

