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
import net.futureclient.installer.Nk;
import net.futureclient.installer.XU;
import net.futureclient.installer.pL;
import net.futureclient.installer.pX;
import net.futureclient.installer.v1;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class T2
implements Nk {
    public final /* synthetic */ vA X;
    private /* synthetic */ Class x;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;

    @Override
    public final /* synthetic */ vA V(Object[] object) {
        Object object2 = (EF)object[0];
        long l2 = (Long)object[1];
        object = (pL)object[2];
        object2 = (Class)((Object)ye.a("\u00c3", (Object)object, (long)110292910009429894L, (long)l2));
        try {
            if (ye.a("j", (Object)((Class)((Object)ye.a("\u00c3", (Object)this, (long)76041302911679080L, (long)l2))), (Object)object2, (long)14258097406989519L, (long)l2) == false) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)3899591546269060L, (long)l2));
        }
        return new pX(this, (Class)object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(3142096005874673648L, -1215624908319141441L, MethodHandles.lookup().lookupClass()).a(50193522304392L);
        d = new HashMap(13);
        long l2 = a ^ 0x278673F0C776L;
        Cipher cipher = Cipher.getInstance(v1.C("`&\u0011*\u000fIP{L\u0010Z\r+\tx:`* n"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(XU.C("\u0007\"Z"));
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
        String string = v1.C("\u00c2\u0012\u00b1\u00ea\u0082m\u000bEa\n\u009e/\u0093\u00d5\u00f2\tiw\u00ca\u00f2\u00c5?\u00df\u00aa\u00de|<\u0013\u00b1u\u0000\u00b9\u0001\u00d9\u0018\u008b\u0098=\u00bc\u00fdc\u00e4\u00aa\u0007\u00e6\u0005y3\u0086\u00b0\u00e4\u00dc_&\u0086|/\u001a\u0090\u00ef\u00a4D\r\u00cd\u000e\u00d9F\u00fb\u0004\\*\u0005\u00b0");
        int n6 = string.length();
        int n7 = 40;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = T2.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(XU.C("y\rxt\bf\u0018zJ8")))).intern();
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
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x3CCC;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(v1.C("@\u0006By_\u0019_tE\u0019A\u0016kIE\u0007&l\u007f1"));
                    arrobject[1] = SecretKeyFactory.getInstance(XU.C("A}\u0005"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(v1.C("-;m68k-v6a }?y5ht|<q1?uH\u00060*Ed"), exception);
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
            byte[] arrby2 = b[n2].getBytes(XU.C("b\u0016845[^<\u0015g"));
            T2.c[n2] = T2.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

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

    public /* synthetic */ T2(Class class_, vA vA2) {
        this.x = class_;
        this.X = vA2;
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

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x44976D527C46L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)T2.a("x", (int)2260, (long)(0x3139767CA7D3C0ECL ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)((Class)((Object)ye.a("\u00c3", (Object)this, (long)-650178520808419940L, (long)l2))), (long)-699483452971125721L, (long)l2))), (long)-758429186240301618L, (long)l2))), (Object)((String)((Object)T2.a("x", (int)27371, (long)(0x5DDFE678D2FC22D2L ^ l2)))), (long)-758429186240301618L, (long)l2))), (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)-714181367146268752L, (long)l2))), (long)-716777215251230141L, (long)l2))), (Object)XU.C("\r"), (long)-758429186240301618L, (long)l2))), (long)-678193047024102879L, (long)l2));
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = T2.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }
}

