/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.awt.Desktop;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Eh;
import net.futureclient.installer.N8;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class TE {
    private static final /* synthetic */ AtomicInteger V;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;

    public static /* synthetic */ void e(Object[] this_) {
        Object object = (URI)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)4460961457973847270L, (long)l2))), (Object)((String)((Object)ye.a("j", (String)((Object)TE.a("w", (int)27976, (long)(0x28F012C4BD9DDCDAL ^ l2))), (Object)((String)((Object)ye.a("G", (Object)object, (long)4400973005182518136L, (long)l2))), (long)4451319026341540548L, (long)l2))), (long)4453277125638463172L, (long)l2);
        object = new Thread(() -> TE.I((URI)object), (String)((Object)ye.a("j", (String)((Object)TE.a("w", (int)28983, (long)(0x4D60482B627740A4L ^ l2))), (Object)((String)((Object)ye.a("G", (int)((AtomicInteger)((Object)ye.a("Z", (long)4454004874075203378L, (long)l2))).incrementAndGet(), (long)4490310617947443485L, (long)l2))), (long)4451319026341540548L, (long)l2)));
        ye.a("j", (Object)object, (boolean)true, (long)4419333786937200181L, (long)l2);
        ye.a("j", (Object)object, (long)4418903432888971310L, (long)l2);
    }

    private static /* synthetic */ void I(URI this_) {
        long l2 = a ^ 0x2DCA34BCC257L;
        try {
            ye.a("j", (Object)((Desktop)((Object)ye.a("G", (long)6292260235290849982L, (long)l2))), (Object)this_, (long)6313760551522426988L, (long)l2);
            return;
        }
        catch (Throwable throwable) {
            ye.a("j", (Object)throwable, (long)6303870344241716905L, (long)l2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0xD25;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Eh.C(")\u0005+z6\u001a6w,\u001a(\u0015\u0002J,\u00048\u0018\u00162"));
                    arrobject[1] = SecretKeyFactory.getInstance(N8.C("k\u0007X"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Eh.C(".Rn_;\u0002.\u001f5\b#\u0014<\u00106\u0001w\u0015?\u00182Vv!\u0005.^,\u0010"), exception);
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
            byte[] arrby2 = b[n2].getBytes(N8.C("\u0018KBiO\u0006S\u0016o:"));
            TE.c[n2] = TE.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(2577186314488763143L, -4080633196407368390L, MethodHandles.lookup().lookupClass()).a(255468210752671L);
        d = new HashMap(13);
        long l2 = a ^ 0x8F03C67B2C7L;
        Cipher cipher = Cipher.getInstance(Eh.C("\t%\u000f^fJ9x%\u00133\u000eB\n\u00119\t)Im"));
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
        String string = Eh.C("\u00bd~\u008a\t\u00b0^\u00a7\u00dc\u00cb;\u00a8\u0085t\u0085\u00b8\u00e1>\u0011R_c^\u009e\"\u00b3\u000f\u00ea'\u00ac\u00ad\u0095\u00d3`\u00d6\u00e4\u00b0N\u00e3\u00e31\u0098\u0094N\u00c6\u0010\u0099p\u00db<R\u008a\u001bj\u00b2\u00eaM\u00c7\u00cc\u0080A\u0004G0{\u00df");
        int n6 = string.length();
        int n7 = 32;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = TE.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(N8.C("\u0003P\u0002)r;b'0e")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[2];
                V = new AtomicInteger(0);
                return;
            }
            n7 = string.charAt(n2);
        }
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = TE.a(this222, l2);
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

