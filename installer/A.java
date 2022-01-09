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
import net.futureclient.installer.N8;
import net.futureclient.installer.Nk;
import net.futureclient.installer.XU;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class A
implements Nk {
    private static final /* synthetic */ String[] b;
    private /* synthetic */ vA U;
    private static final /* synthetic */ Map d;
    private /* synthetic */ Class t;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ long a;

    /*
     * Exception decompiling
     */
    private static /* synthetic */ CallSite a(MethodHandles.Lookup this, String this, MethodType this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Expecting a ConstantPoolEntryLiteral or ConstantPoolEntryDynamicInfo
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackType(OperationFactoryLDC.java:37)
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackDelta(OperationFactoryLDC.java:18)
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ vA V(Object[] object) {
        Object[] arrobject = object;
        object = (EF)object[0];
        long l2 = (Long)arrobject[1];
        object = (pL)arrobject[2];
        try {
            if ((Class)((Object)ye.a("\u00c3", (Object)object, (long)110292910009429894L, (long)l2)) == (Class)((Object)ye.a("\u00c3", (Object)this, (long)35621576115569257L, (long)l2))) {
                return (vA)((Object)ye.a("\u00c3", (Object)this, (long)141736376440455183L, (long)l2));
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)197027339507014236L, (long)l2));
        }
        return null;
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x620DB1747F16L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)A.a("z", (int)8296, (long)(0x583F1376D949173FL ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)((Class)((Object)ye.a("\u00c3", (Object)this, (long)-6776366249581616158L, (long)l2))), (long)-6902366958008524200L, (long)l2))), (long)-6699466187669118031L, (long)l2))), (Object)((String)((Object)A.a("z", (int)11368, (long)(0x2DDC7701DD469B3EL ^ l2)))), (long)-6699466187669118031L, (long)l2))), (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)-6882482000981876348L, (long)l2))), (long)-6885356524584238020L, (long)l2))), (Object)N8.C("P"), (long)-6699466187669118031L, (long)l2))), (long)-6851767961638976418L, (long)l2));
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = A.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    public /* synthetic */ A(Class class_, vA vA2) {
        this.t = class_;
        this.U = vA2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-6326308873168731082L, 8245421569905043510L, MethodHandles.lookup().lookupClass()).a(44249092030924L);
        d = new HashMap(13);
        long l2 = a ^ 0xEB7A389D017L;
        Cipher cipher = Cipher.getInstance(XU.C("3\\KY&Iy{e\u0010s\r\u0002\tQ:I*\tn"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
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
        String[] arrstring = new String[2];
        int n5 = 0;
        String string = XU.C("pj\u0018\u00ff^Qk\u008cf\u00dc\u0082\u00c5Cu}7\"\u00a6\u009e\u00fa\u0090\u00f2\u00c9\u001a\u001d\u007fW\u00a2l\u00fa\u00f4\u0019d\u00ef\u00ff\u00cc6N|/\u00ec\u00dc\u00cb\u00b4m\u00a5\u00cc\u00bf\u00b5\u00db\u0094Vz\u009f\u008d\u0006\u00d2V\u000f\u001fiW6A\u001d");
        int n6 = string.length();
        int n7 = 32;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = A.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(N8.C("\u0003P\u0002)r;b'0e")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[2];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x15DC;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(XU.C("n\u0001~l{\u0014vte\u0010\u007f\u0001\u001e\u0015\u0016}|\u001fV1"));
                    arrobject[1] = SecretKeyFactory.getInstance(N8.C("o\u0007X"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(XU.C("C&\u00036V+C,X!N/Q3[/\u001a2R!_$\u001bu}\u0004\u0017\u0017"), exception);
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
            byte[] arrby2 = b[n2].getBytes(N8.C("\u000f\\\u001e55|W\u0012o:"));
            A.c[n2] = A.a(((Cipher)arrobject[0]).doFinal(arrby2));
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
}

