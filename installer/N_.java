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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N8;
import net.futureclient.installer.NH;
import net.futureclient.installer.TO;
import net.futureclient.installer.Xl;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class N_ {
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    public /* synthetic */ byte[] B;
    public /* synthetic */ int T;

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x4A46;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u0014\f@\u0018\\,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(NH.C("C|j"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(\u0001A\u000e\u001a\fT"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NH.C("cy9[..2>\u0014\b"));
            N_.c[n2] = N_.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    public /* synthetic */ N_() {
        this.B = new byte[64];
    }

    /*
     * WARNING - void declaration
     */
    public final /* synthetic */ N_ x(Object[] arrobject22) {
        void var6_6;
        long l2;
        int arrobject22;
        block3: {
            N_ n_;
            block2: {
                arrobject22 = (Integer)arrobject22[0];
                l2 = (Long)arrobject22[1];
                l2 = a ^ l2;
                long l3 = l2 ^ 0x4A557E89A1DAL;
                CallSite callSite = ye.a("\u00c3", (Object)this, (long)-2845295818711904556L, (long)l2);
                try {
                    if (callSite + true <= ((CallSite)ye.a("\u00c3", (Object)this, (long)-2753712492294449105L, (long)l2)).length) break block2;
                    Object[] arrobject = new Object[2];
                    arrobject[1] = 1;
                    arrobject[0] = l3;
                    ye.a("j", (Object)this, (Object)arrobject, (long)-2717179898623501104L, (long)l2);
                    n_ = this;
                    break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-2742217624319738908L, (long)l2));
                }
            }
            n_ = this;
        }
        ye.a("\u00c3", (Object)n_, (long)-2753712492294449105L, (long)l2)[callSite] = (CallSite)((byte)arrobject22);
        ye.a("F", (Object)this, (int)(++var6_6), (long)-2845295818711904556L, (long)l2);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final /* synthetic */ N_ I(Object[] arrobject22) {
        void var6_8;
        N_ n_;
        long l2;
        int arrobject22;
        block3: {
            block2: {
                arrobject22 = (Integer)arrobject22[0];
                l2 = (Long)arrobject22[1];
                l2 = a ^ l2;
                long l3 = l2 ^ 0x3888CD834C3DL;
                CallSite callSite = ye.a("\u00c3", (Object)this, (long)3847209166868259635L, (long)l2);
                try {
                    if (callSite + 2 <= ((CallSite)ye.a("\u00c3", (Object)this, (long)3760413116340450760L, (long)l2)).length) break block2;
                    Object[] arrobject = new Object[2];
                    arrobject[1] = 2;
                    arrobject[0] = l3;
                    ye.a("j", (Object)this, (Object)arrobject, (long)4012093306518122807L, (long)l2);
                    n_ = this;
                    break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)3753430627053065731L, (long)l2));
                }
            }
            n_ = this;
        }
        CallSite callSite = ye.a("\u00c3", (Object)n_, (long)3760413116340450760L, (long)l2);
        CallSite callSite2 = callSite;
        callSite[callSite] = (CallSite)((byte)(arrobject22 >>> 8));
        callSite2[++var6_7] = (CallSite)((byte)arrobject22);
        ye.a("F", (Object)this, (int)(++var6_8), (long)3847209166868259635L, (long)l2);
        return this;
    }

    public static /* synthetic */ Spliterator y(Object[] this_2) {
        boolean bl;
        int n2;
        long l2;
        Object object;
        long l3;
        long l4;
        long l5;
        Object object2;
        block6: {
            block7: {
                boolean bl2;
                CallSite callSite;
                block4: {
                    block5: {
                        object2 = (TO)this_2[0];
                        l5 = (Long)this_2[1];
                        l5 = a ^ l5;
                        l4 = l5 ^ 0x2D8EEDD7E45AL;
                        l3 = l5 ^ 0x767419BAC799L;
                        Spliterator spliterator = (Spliterator)((Object)ye.a("j", (Object)((Set)((Object)ye.a("j", (Object)object2, (Object)new Object[0], (long)6599723176370854913L, (long)l5))), (long)6608847341047707620L, (long)l5));
                        object = spliterator;
                        l2 = (long)ye.a("j", (Object)object2, (long)6623810821918996417L, (long)l5);
                        n2 = 0x40 | ye.a("j", (Object)object, (long)6363445041718612573L, (long)l5) & 0x510;
                        object = this_ -> {
                            long l2 = a ^ 0x7996F4165005L;
                            return (Spliterator)((Object)ye.a("j", (Object)((List)((Object)ye.a("G", (int)ye.a("j", (Object)this_, (Object)new Object[0], (long)-2545947394969152173L, (long)l2), (Object)ye.a("j", (Object)this_, (Object)new Object[0], (long)-2345797375029137017L, (long)l2), (long)-2375350552583697579L, (long)l2))), (long)-2364960994209579270L, (long)l2));
                        };
                        object2 = spliterator;
                        callSite = ye.a("G", (long)6537898656625735640L, (long)l5);
                        try {
                            bl2 = n2 & 0x4000;
                            if (callSite == null) break block4;
                            if (bl2) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)6595461043570260370L, (long)l5));
                        }
                        bl2 = true;
                        break block4;
                    }
                    bl2 = false;
                }
                try {
                    Object[] arrobject = new Object[3];
                    arrobject[2] = l4;
                    arrobject[1] = (String)((Object)N_.a("c", (int)13758, (long)(0x5ECC03F9B085A65AL ^ l5)));
                    arrobject[0] = bl2;
                    ye.a("G", (Object)arrobject, (long)6401597768305293411L, (long)l5);
                    bl = n2 & 4;
                    if (callSite == null) break block6;
                    if (bl) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)6595461043570260370L, (long)l5));
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        Object[] arrobject = new Object[3];
        arrobject[2] = l4;
        arrobject[1] = (String)((Object)N_.a("c", (int)7327, (long)(0x1879CF9203488F7AL ^ l5)));
        arrobject[0] = bl;
        ye.a("G", (Object)arrobject, (long)6401597768305293411L, (long)l5);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object2;
        arrobject2[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject2, (long)6367548823579417849L, (long)l5);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l3;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject3, (long)6367548823579417849L, (long)l5);
        return new Xl(null, (Spliterator)object2, n2, l2, (Function)object);
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
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(5596597088239085625L, 5593620556267691299L, MethodHandles.lookup().lookupClass()).a(72979091162860L);
        d = new HashMap(13);
        long l2 = a ^ 0x535824005B1FL;
        Cipher cipher = Cipher.getInstance(N8.C(")a/\u001a\\\u0014\u0003&\u001fM\tPxT+g3ws3"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(NH.C("h#5"));
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
        String string = N8.C("zh\u0083\u0085\u00d5\u00fb\u00c1&C\u00ce\u008fw\u0097\"\u00b4`\u0088\u008f\u0081x}\u008b\u00cf \u0083\u00f0&Y\u00aay \u00a3@\u0007\u00e0\u00f9B4\tw%\u0007*\f\u00b6\u00ef\u00fd#\u00a3I\u00e6c\u007f\f*\u00e0\u00bc\u0012\u00fcn\u00a9:\u00a3{\u00c6n\u00d0-\u00db j\u0018\u000e\u0017\u00b2\u0012\u00cc\u0003\u00d9-CCq\u00e1\f\u0093\u0084\u0090\u008f\u0019\u00a1J!INl[\u00a2R\u0017\u00fe0\u00f9s\u00a7\u00c3E\u008c\u0007\u00ae\u00c9\u001b\u0095\u00b5\u00ccOV=D#\u0093\u0084\u00cb2\u0018\u00c3A\u0015!P\u00a7\u00be\u001f\u00f3\u00c1\u00e1\u0083\u00b2\u00ec~\u00f3p\u00e4\u00cdh\u0081\u00b8\u00a8B\u00a4\u0093k\u00c7H\u0098\u00e4\u00ad\u00ce\u00b2\u00f5D");
        int n6 = string.length();
        int n7 = 72;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = N_.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(NH.C("xby\u001b\t\t\u0019\u0015KW")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[2];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = N_.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    public final /* synthetic */ void M(Object[] this222) {
        int n2;
        long l2 = (Long)this222[0];
        Object this222 = (Integer)this222[1];
        l2 = a ^ l2;
        int n3 = 2 * ((CallSite)ye.a("\u00c3", (Object)this, (long)-665729757976725723L, (long)l2)).length;
        this222 = ye.a("\u00c3", (Object)this, (long)-609822292278648354L, (long)l2) + this222;
        CallSite callSite = ye.a("G", (long)-592456263325738332L, (long)l2);
        try {
            n2 = n3;
            if (callSite != null) {
                n2 = n2 > this222 ? n3 : this222;
            }
        }
        catch (RuntimeException runtimeException) {
            try {
                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-649735757140650770L, (long)l2));
            }
            catch (RuntimeException runtimeException2) {
                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-649735757140650770L, (long)l2));
            }
        }
        byte[] this222 = new byte[n2];
        ye.a("G", (Object)ye.a("\u00c3", (Object)this, (long)-665729757976725723L, (long)l2), (int)0, (Object)this222, (int)0, (int)ye.a("\u00c3", (Object)this, (long)-609822292278648354L, (long)l2), (long)-605013880080267395L, (long)l2);
        ye.a("F", (Object)this, (byte[])this222, (long)-665729757976725723L, (long)l2);
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

