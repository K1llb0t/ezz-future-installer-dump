/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.IOException;
import java.io.StringWriter;
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
import net.futureclient.installer.N8;
import net.futureclient.installer.Nu;
import net.futureclient.installer.pQ;
import net.futureclient.installer.pg;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class pi {
    private static final /* synthetic */ long c;
    private static final /* synthetic */ String[] d;
    private static final /* synthetic */ Map f;
    private static final /* synthetic */ String[] e;

    public final /* synthetic */ pQ N(Object[] object) {
        long l2;
        block6: {
            pi pi2;
            block5: {
                l2 = (Long)object[0];
                l2 = c ^ l2;
                object = ye.a("G", (long)4428764784311619605L, (long)l2);
                try {
                    pi2 = this;
                    if (object == null) break block5;
                    if (!(pi2 instanceof pQ)) break block6;
                    pi2 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    try {
                        throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)4581814400461529020L, (long)l2));
                    }
                    catch (IllegalStateException illegalStateException2) {
                        throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException2, (long)4581814400461529020L, (long)l2));
                    }
                }
            }
            return (pQ)pi2;
        }
        throw new IllegalStateException((String)((Object)ye.a("j", (String)((Object)pi.a("z", (int)30231, (long)(0x31EC57589A867BC7L ^ l2))), (Object)((String)((Object)ye.a("G", (Object)this, (long)4596537415699382689L, (long)l2))), (long)4548363900113350685L, (long)l2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x33BE;
        if (e[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])f.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u00142~.j,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(Nu.C("z\u0011e"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    f.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(?\u007f8,2b"), exception);
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
            byte[] arrby2 = d[n2].getBytes(Nu.C("\u000evTT}\u001fi\u0007y\u0007"));
            pi.e[n2] = pi.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return e[n2];
    }

    public /* synthetic */ long L(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)-8236000881283730397L, (long)l2)));
    }

    private static /* synthetic */ IllegalStateException b(IllegalStateException this_) {
        return this_;
    }

    public /* synthetic */ String l(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)-4230926589385032488L, (long)l2)));
    }

    public /* synthetic */ double e(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)6223029340340793292L, (long)l2)));
    }

    public /* synthetic */ Number x(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)-8737006708696973521L, (long)l2)));
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

    public /* synthetic */ int W(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)-6755985031604053075L, (long)l2)));
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = pi.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        c = wu.a(5184057022346807856L, -6834358380787152347L, MethodHandles.lookup().lookupClass()).a(28248614284169L);
        f = new HashMap(13);
        long l2 = c ^ 0x2ADC662E02E9L;
        Cipher cipher = Cipher.getInstance(N8.C("\u0017_\u0019,\\\u0014\u0003&\u001fM\tPxT+g3ws3"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Nu.C("gN:"));
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
        String string = N8.C("\u00f6\u0094\u00bd\u00b4\u0000JG\u001dyz\u00a8W\u00cb\u00a4\u00ad\u00fc7\u00edHlC\u00f4\u00ae\f\u00e3&\u00ac6\u008cO\u00f3\u00126bhz\u00d7\u0093\u009e(3\u0093\u00d7\u00bb\u0091Q\u00f6\u0011\u00c1\u001b1n\u00f2\u0090\u0014\u00a6\u0081$\u00d4.\u0016\u00c2/$\u0095\u00cdB\u009b\u001a\u00d8\u00f5\u0082\u00be\t K\u00d3K\u0018X[\u00fc\bx\b\u0016\u0018\b\u008e");
        int n6 = string.length();
        int n7 = 40;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = pi.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(Nu.C("\u0015m\u0014\u0014d\u0006t\u001a&X")))).intern();
            if ((n2 += n7) >= n6) {
                d = arrstring;
                e = new String[2];
                return;
            }
            n7 = string.charAt(n2);
        }
    }

    public /* synthetic */ boolean M(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", this.getClass(), (long)-8497282617348885629L, (long)l2)));
    }

    public final /* synthetic */ pg A(Object[] object) {
        long l2;
        block6: {
            pi pi2;
            block5: {
                l2 = (Long)object[0];
                l2 = c ^ l2;
                object = ye.a("G", (long)-7838779273160425900L, (long)l2);
                try {
                    pi2 = this;
                    if (object == null) break block5;
                    if (!(pi2 instanceof pg)) break block6;
                    pi2 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    try {
                        throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)-7938453916613348867L, (long)l2));
                    }
                    catch (IllegalStateException illegalStateException2) {
                        throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException2, (long)-7938453916613348867L, (long)l2));
                    }
                }
            }
            return (pg)pi2;
        }
        throw new IllegalStateException((String)((Object)ye.a("j", (String)((Object)pi.a("z", (int)26479, (long)(0x5EC4567F8D4CC4FFL ^ l2))), (Object)((String)((Object)ye.a("G", (Object)this, (long)-7959263801336303648L, (long)l2))), (long)-7971893550969004452L, (long)l2)));
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

    public /* synthetic */ String toString() {
        long l2 = c ^ 0x4478B5255812L;
        long l3 = l2 ^ 0x691AE0E93CC6L;
        long l4 = l2 ^ 0x3E21008F6FA6L;
        try {
            StringWriter stringWriter = new StringWriter();
            L l5 = new L(l4, stringWriter);
            ye.a("F", (Object)l5, (boolean)true, (long)8183505533844659237L, (long)l2);
            Object[] arrobject = new Object[3];
            arrobject[2] = l3;
            arrobject[1] = l5;
            arrobject[0] = this;
            ye.a("G", (Object)arrobject, (long)8227263994085925436L, (long)l2);
            return (String)((Object)ye.a("j", (Object)stringWriter, (long)8206984954288036745L, (long)l2));
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

