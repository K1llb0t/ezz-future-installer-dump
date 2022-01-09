/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Xb;
import net.futureclient.installer.Xm;
import net.futureclient.installer.h;
import net.futureclient.installer.pe;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class X1
extends Xm {
    private static final /* synthetic */ String[] d;
    private static final /* synthetic */ String[] c;
    private final /* synthetic */ Field O;
    private final /* synthetic */ Object w;
    private static /* synthetic */ Class W;
    private static final /* synthetic */ long b;
    private static final /* synthetic */ Map e;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        X1.b = wu.a(6731455760652815771L, -7708500293040294086L, MethodHandles.lookup().lookupClass()).a(20498141826633L);
        X1.e = new HashMap<K, V>(13);
        var0 = X1.b ^ 54048573338661L;
        var2_1 = Cipher.getInstance(pe.C("\u007fWo:jBg\"tFnW\u000fC\u0007+tP\u00177"));
        v0 = SecretKeyFactory.getInstance(Xb.C("\u001dbc"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var0 >>> 56);
        v3 = var3_2 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var3_2++;
            v2[v4] = (byte)(var0 << v4 * 8 >>> 56);
            v3 = var3_2;
        }
        var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var7_3 = new String[4];
        var5_4 = 0;
        var4_5 = pe.C("wZ<ft@\u00aa\u00c8\u00b0\u00e1:\u008d\u00fd\u00d2ho\u00f5\u00b9\u00b2=\u00e0\u00f2\u00e9\u001b\u001c\u0004>6mW\u008c\u00ddM\u00b2\u00d1\u00f4\u001a\u008f\u0007\u00a3B\u0001=b\u00c9e\u00ad\u00d0?\u00df\u00c7C6\u0018\u00d0\u00b7\u0084e\u00f6\u0097\u0094P\u00e7\u0083\u00b1%\u0013ko\u0088\u0099\u008b\u00d5K\u00fa$pO(\u00cf}X\u0090^\u00c22J\u000b\u00f8\u008a_!\u0081\u00fb\u00bc\u00fb\u0011\u009a\u00c9\u00d0H0|c\u0011\n\u00da\u00c4*|\u001a\u00fbn\u008c\u00af\u00b0mA\u00935\u000fg\u00b3(\u00cc:\u0017\u00c0\u0013\u00d1\u00b4\u00fe\u00972r\u00bb~kR\u00b3\u00c8\u008b[.\u0086=\u00b9\u00b2\"\u0018\u0088\u00f8d\u00e0+\u00e0\u00b8\u00a1\u00039\u0095\u0084\u00d9_>}\u00c7\u009c\u00d5}ks\u00e3\u00d3@'\u00d0\u00af\u00ac\u0011\u00a36**\u0003$\u00d5o\u00a2\u0094\u00b7\u009c]\u0014o\u00f0\u0012o\u00b6\u00d9\u009c\u00f29\b\u00c3\u00f2\u00eeVIA\u00cf\rQ\u009cTzL\u00a5\fO\u00f2\u00cf\u0086MI0\u00eeN$\u0014\u0095\u00f1\u00c9\u00876\u00fd\u0017%\u00914\u00b7G\u009c\u0003|+\u0083\u00f1\u00ffPtW\u008933\u00f3\u00b7\u0010U\u009e\u00ad\u00a2\u00e7\u00c7\u0094");
        var6_6 = var4_5.length();
        var1_7 = 72;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Xb.C("\u00f2<\u0084H\u0090\u009a\u0085A\u00f2\u00dd\u00d0\u00b3xd\u0014\u0001\u00ef\u008a\u00a1\u00d83[\r\u00bf\u00ba[\u0086\u00ab\u00d4\u00a5\u0019\u00a5m\u009a\u0095\u00ccq\u00ed\b}H\u00c3\u00b3\u00c9^Y\u00eau\n\u00ac$6\u00f8\u0001k\u00bd\u00fb\u00ff\u00a5\u0085\u0093\u00d4\u00ca-\u0091\u008bn\u009a6\u00de\u0011\u0018\u00da");
                var6_6 = var4_5.length();
                var1_7 = 40;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = X1.a(var2_1.doFinal(v6.getBytes(pe.C("dWu>^w%\u0000Ta")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = X1.a(var2_1.doFinal(v6.getBytes(pe.C("dWu>^w%\u0000Ta")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        X1.c = var7_3;
                        X1.d = new String[4];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
    }

    private static /* synthetic */ Object v(Object[] this_) {
        try {
            W = Class.forName(Xb.C("\u0013\u000f\u0003T\u0000\u001a\u0017\u0007]mA=8AU"));
            Field field = W.getDeclaredField(pe.C("pRv3!cX\u001f5"));
            field.setAccessible(true);
            return field.get(null);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static /* synthetic */ Field E(Object[] this_) {
        try {
            return AccessibleObject.class.getDeclaredField(Xb.C("\u000b\u0005]]<0CU"));
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void E(Object[] object) {
        Object object2 = object;
        long l2 = (Long)object2[0];
        object = (AccessibleObject)object2[1];
        long l3 = l2 ^ 0x33872A8A0B81L;
        try {
            Object[] arrobject = new Object[2];
            arrobject[1] = l3;
            arrobject[0] = object;
            if (ye.a("j", (Object)this, (Object)arrobject, (long)-53832240309231397L, (long)l2) != false) return;
            try {
                ye.a("j", (Object)object, (boolean)true, (long)-85605210716918752L, (long)l2);
                return;
            }
            catch (SecurityException securityException) {
                throw new h((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)X1.a("n", (int)10543, (long)(0x4E16C26D25EF1787L ^ l2)))), (Object)object, (long)-40148653659890881L, (long)l2))), (Object)((String)((Object)X1.a("n", (int)26366, (long)(0x1F1336E2C84CD857L ^ l2)))), (long)-286639087087731534L, (long)l2))), (long)-5997917881885859L, (long)l2)), securityException);
            }
        }
        catch (h h2) {
            throw (Exception)((Object)ye.a("G", (Object)h2, (long)-97559709357246828L, (long)l2));
        }
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = X1.a(this222, l2);
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

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    public /* synthetic */ X1() {
        this.w = X1.v(new Object[0]);
        this.O = X1.E(new Object[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x4320;
        if (d[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])e.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Xb.C("!71Z4\"9B*&07Q#YK*0IW"));
                    arrobject[1] = SecretKeyFactory.getInstance(pe.C("}<\u0003"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    e.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Xb.C("\u0001\u0007\u0001\u0017I\n\u001c\r\u001d\u0000\u0011\u000e\u001c\u0012\u000e\u000eB\u0013\u0003\u0000\u0010\u0005\u001fTJ<v\u007f\u0001"), exception);
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
            byte[] arrby2 = c[n2].getBytes(pe.C("dWu>^w%\u0000Ta"));
            X1.d[n2] = X1.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return d[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean c(Object[] this) {
        block10: {
            this = (AccessibleObject)this /* !! */ [0];
            var2_3 = (Long)this /* !! */ [1];
            var2_3 = X1.b ^ var2_3;
            var4_4 = ye.a("G", (long)8327204859337645811L, (long)var2_3);
            try {
                v0 = this;
                if (var4_4 == null) break block10;
                if ((Object)ye.a("\u00c3", (Object)v0, (long)8265699538490119109L, (long)var2_3) == null) return false;
                v0 = this;
            }
            catch (Exception v1) {
                try {
                    throw (Exception)ye.a("G", (Object)v1, (long)8333072640775060372L, (long)var2_3);
                }
                catch (Exception v2) {
                    throw (Exception)ye.a("G", (Object)v2, (long)8333072640775060372L, (long)var2_3);
                }
            }
        }
        try {
            v3 = (Field)ye.a("\u00c3", (Object)v0, (long)8163925708695607095L, (long)var2_3);
            if (var4_4 != null) {
                if (v3 == null) return false;
            }
            ** GOTO lbl51
        }
        catch (Exception v4) {
            throw (Exception)ye.a("G", (Object)v4, (long)8333072640775060372L, (long)var2_3);
        }
        try {
            v5 = new Class[1];
            v5[0] = Field.class;
            v6 = new Object[1];
            v6[0] = (Field)ye.a("\u00c3", (Object)this, (long)8163925708695607095L, (long)var2_3);
            v3 = ye.a("j", (Object)((Method)ye.a("j", (Object)((Class)ye.a("Z", (long)8328169617550171748L, (long)var2_3)), (Object)((String)X1.a("n", (int)21537, (long)(6613810728194074507L ^ var2_3))), (Object)v5, (long)8164296562026923347L, (long)var2_3)), (Object)ye.a("\u00c3", (Object)this, (long)8265699538490119109L, (long)var2_3), (Object)v6, (long)8271518464089859931L, (long)var2_3);
lbl51:
            // 2 sources

            var5_5 = ye.a("j", (Object)((Long)v3), (long)8257691105229620093L, (long)var2_3);
            v7 = new Class[3];
            v7[0] = Object.class;
            v7[1] = (Class)ye.a("Z", (long)8155873964077683982L, (long)var2_3);
            v7[2] = (Class)ye.a("Z", (long)8162604010386143755L, (long)var2_3);
            v8 = new Object[3];
            v8[0] = this;
            v8[1] = (Long)ye.a("G", (long)var5_5, (long)8234621570503757842L, (long)var2_3);
            v8[2] = (Boolean)ye.a("Z", (long)8327940785655905086L, (long)var2_3);
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)((Class)ye.a("Z", (long)8328169617550171748L, (long)var2_3)), (Object)((String)X1.a("n", (int)5605, (long)(7487141774985373262L ^ var2_3))), (Object)v7, (long)8164296562026923347L, (long)var2_3)), (Object)ye.a("\u00c3", (Object)this, (long)8265699538490119109L, (long)var2_3), (Object)v8, (long)8271518464089859931L, (long)var2_3);
            return true;
        }
        catch (Exception v9) {}
        return false;
    }
}

