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
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N2;
import net.futureclient.installer.Tz;
import net.futureclient.installer.pe;
import net.futureclient.installer.v6;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class TC {
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Logger z;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;

    private static /* synthetic */ void d(Object[] this_) {
        long l2 = (Long)this_[0];
        ServiceConfigurationError serviceConfigurationError = (ServiceConfigurationError)this_[1];
        l2 = a ^ l2;
        ye.a("j", (Object)((Logger)((Object)ye.a("Z", (long)-7941120701777112089L, (long)l2))), (Object)((Level)((Object)ye.a("Z", (long)-7909687813951873325L, (long)l2))), (Object)((String)((Object)TC.a("y", (int)26247, (long)(0x6543F7C34D90B763L ^ l2)))), (Object)serviceConfigurationError, (long)-7922752987933158236L, (long)l2);
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = TC.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x4229;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(v6.C("c\u0003snv\u0016{vh\u0012r\u0003\u0013\u0017\u001b\u007fd\by\u0011"));
                    arrobject[1] = SecretKeyFactory.getInstance(pe.C("qNq"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(v6.C("5E5U}H(O)B%L(P:LvQ7B$G+\u0016~rNC5"), exception);
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
            byte[] arrby2 = b[n2].getBytes(pe.C("dWu>^w)\f&\u0013"));
            TC.c[n2] = TC.a(((Cipher)arrobject[0]).doFinal(arrby2));
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

    private /* synthetic */ TC() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ N2 O(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x5106CFF195ECL;
        Object object = (ServiceLoader)((Object)ye.a("G", N2.class, (long)343294772682671892L, (long)l2));
        object = (Iterator)((Object)ye.a("j", (Object)object, (long)366458452634607165L, (long)l2));
        while (true) {
            Object object2 = object;
            long l4 = 380144630369337239L;
            long l5 = l2;
            if (l5 < 0L) return (N2)((Object)ye.a("j", (Object)object2, (long)l4, (long)l5));
            if (ye.a("j", (Object)object2, (long)l4, (long)l5) == false) return new Tz(0);
            try {
                object2 = object;
                l4 = 502330863445550976L;
                l5 = l2;
                return (N2)((Object)ye.a("j", (Object)object2, (long)l4, (long)l5));
            }
            catch (ServiceConfigurationError serviceConfigurationError) {
                try {
                    Object[] arrobject = new Object[2];
                    arrobject[1] = serviceConfigurationError;
                    arrobject[0] = l3;
                    ye.a("G", (Object)arrobject, (long)501578815630234340L, (long)l2);
                    if (l2 >= 0L) continue;
                    return new Tz(0);
                }
                catch (ServiceConfigurationError serviceConfigurationError2) {
                    Object[] arrobject = new Object[2];
                    arrobject[1] = serviceConfigurationError2;
                    arrobject[0] = l3;
                    ye.a("G", (Object)arrobject, (long)501578815630234340L, (long)l2);
                }
            }
            break;
        }
        return new Tz(0);
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

    public static /* synthetic */ long M(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        return (long)ye.a("G", (long)7344106104287454829L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-3975342550930455372L, 6543158402971790812L, MethodHandles.lookup().lookupClass()).a(133777909453472L);
        long l2 = a ^ 0xD626A6FA3F8L;
        long l3 = l2 ^ 0x6A3510F9A46FL;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance(v6.C("c\u0003snv\u0016{vh\u0012r\u0003\u0013\u0017\u001b\u007fd\by\u0011"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(pe.C("qNq"));
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
        String string = v6.C("\u001f\u00f3\u00cc}\u00cc\u00bd\u00c2t\u0086\u00acy\u00f0\u00c0alH8\u00aa\u009aT\u00bb`\u00ba\u0015\u00b2Z\u00f3\u0011\u00d4\u00fey\b\u0097]\u00feeZ\u00d6>\u00e2\u0086\u00d8\u00e7\u00f1\u00bah\u00f7\u00fe\u00ce[\u00b0H\u00be\u0015\u00b9Di\u00f2\u00b0\u00a0\u00ef\u00c9ZH\u009fu\u00d6\u00da\u008b\u00ed2\u0010\u00e0X\\\u009at(\u00ff\u0097\u00e7\u001c6\u00f8\u0090\u00e0\u00a2\u00e4\u00ae\u009f\f\u00bf9\u00fd_\u00c5\u00f2\\\u00d5'\u0094MY\u0012\u00b6\u009c\u001a\u0080\u0014\u00dc\u0012q\u00f9\u0017\u008fb\u00d4\u00fa\u00caZC");
        int n6 = string.length();
        int n7 = 16;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = TC.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(pe.C("dWu>^w)\f&\u0013")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[2];
                z = (Logger)((Object)ye.a("G", (String)((Object)ye.a("j", TC.class, (long)-6849501022525447524L, (long)l2)), (long)-6829561035408271595L, (long)l2));
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                N2 cfr_ignored_0 = (N2)((Object)ye.a("G", (Object)arrobject, (long)-6864187676862458105L, (long)l2));
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    public static /* synthetic */ String H(Object[] this_) {
        long l2 = (Long)this_[0];
        double d2 = (Double)this_[1];
        l2 = a ^ l2;
        Object[] arrobject = new Object[1];
        arrobject[0] = (Double)((Object)ye.a("G", (double)d2, (long)-5235944833525484620L, (long)l2));
        return (String)((Object)ye.a("G", (Object)((Locale)((Object)ye.a("Z", (long)-5204970167909298835L, (long)l2))), (Object)((String)((Object)TC.a("y", (int)11923, (long)(0x45AB2091401CD956L ^ l2)))), (Object)arrobject, (long)-5238262660254974362L, (long)l2));
    }
}

