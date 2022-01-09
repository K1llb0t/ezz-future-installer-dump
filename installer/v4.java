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
import net.futureclient.installer.L;
import net.futureclient.installer.Na;
import net.futureclient.installer.Nu;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class v4
extends vA {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] a;
    private static final /* synthetic */ Map c;

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
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x228D;
        if (b[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])c.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Nu.C("\u0005f\u0007\u0019\u001ay\u001a\u0014\u0000y\u0004v.)\"Ee\n:Q"));
                    arrobject[1] = SecretKeyFactory.getInstance(Na.C("\u0013/F"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    c.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Nu.C("M~\rsX.M3V$@8_<U-\u00149\\4Qz\u0015/DsL\"\u0002"), exception);
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
            byte[] arrby2 = a[n2].getBytes(Na.C("r\u0017c~H7\u001dnG$"));
            v4.b[n2] = v4.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return b[n2];
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object object2 = (L)object[0];
        long l2 = (Long)object[1];
        object = object[2];
        object2 = (Class)object;
        throw new UnsupportedOperationException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)v4.a("f", (int)19688, (long)(0x7563A0E6488C9F88L ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)object2, (long)8309928871920202047L, (long)l2))), (long)8097937682894631126L, (long)l2))), (Object)((String)((Object)v4.a("f", (int)4431, (long)(0x27600FE36DB2422CL ^ l2)))), (long)8097937682894631126L, (long)l2))), (long)8326787111714395961L, (long)l2)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        c = new HashMap(13);
        long l2 = wu.a(2260513029638320159L, -6293756890986151590L, MethodHandles.lookup().lookupClass()).a(178048727511258L) ^ 0x6430304333D2L;
        Cipher cipher = Cipher.getInstance(Nu.C("\u0007dRLJ)\u0015\u001b\tp\u001fmni=Z%Je\u000e"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Na.C("\u0013/F"));
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
        String string = Nu.C("D\u009buuj\u00ce\u0012\u00c3\u00f5k\u0013\u0000#zQ\u00b1\u00c7@\u00b1\u00d8Z\u00d5kD\u00fa\u00cf>\u00f4\u00d6\u00c1(G>\u00f0\u009e\u0083\u009cODz3\u001b|8\u00f2k\u00a3\u00a1\u00fe\u00ccV\u00c9g\u00fc?\u00ff\u00b6zW\u00beQZ}%=\u00f2\u00fb\u00b2\u0015\u0017#\u00b1G\u00ff\u0019\u0081\"jX\tY\u0086\u00c4V'B\u0091JT\u008c@\u00f4\u00b8\u00aa\u000f\u00b36\u00a6K~ \u00e9\u00deh\u007fD\u00dd\u009be\u00f6~t:gK\u00b8\u00b3B\u00a12\u00d0\u00de\"\u0089\u001e\u0098j9\u0000\u0090\u0006\u0092'\r\u00a79\u00bc\u00f1\u0091\u0018\u0006/v\u00df\u00a7\u00bd\u00b0\f\u0018\u00a4\u00bb\u00f1\u00fa\u000e\u000b\u0013\u00d3\u001a>\u00ef\u00ffh\u00ce7\u0013\u00c98\u001f\u00d3\u00dd^\u00cd?\u00b6*\u0090\u009eN?\u00f4QS<M^\u00fe\u00a8\u00e8\n\u0088\u00b4\u001bY\u00e1?\u001fL!\u00b1\u00c6\u00147\u0012\u0083\u00fet\u00d8\u0007\u00caq5\u00f4\u00d2<L;}\u009b\u0004\u00d3\u00a3\u00f2\u0012Y\u0014\u00e7\u00f8\u00170\u00cdD\u00b3\u0002\u00efl\u00e1\u00dea\u00f0J\u00d0\u00c9P\u00ab\u007f5\u00f7\u001b\n\u00f6\u00c2\u00b3Le\u0084\u00a12\u0016\u00dd\u00cd\u00bf\u0093\u00b4z\u00e7\u00acT\u00d32\u008a\u00b3\u0081`\u008c");
        int n6 = string.length();
        int n7 = 128;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = v4.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(Na.C("r\u0017c~H7\u001dnG$")))).intern();
            if ((n2 += n7) >= n6) {
                a = arrstring;
                b = new String[3];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        throw new UnsupportedOperationException((String)((Object)v4.a("f", (int)19533, (long)(0x4F78E8640FA398CFL ^ l2))));
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = v4.a(this222, l2);
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

