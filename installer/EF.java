/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NC;
import net.futureclient.installer.NE;
import net.futureclient.installer.NF;
import net.futureclient.installer.NZ;
import net.futureclient.installer.Nk;
import net.futureclient.installer.Q;
import net.futureclient.installer.XP;
import net.futureclient.installer.XU;
import net.futureclient.installer.e;
import net.futureclient.installer.h;
import net.futureclient.installer.i;
import net.futureclient.installer.k;
import net.futureclient.installer.p7;
import net.futureclient.installer.p9;
import net.futureclient.installer.pL;
import net.futureclient.installer.pO;
import net.futureclient.installer.pS;
import net.futureclient.installer.p_;
import net.futureclient.installer.pa;
import net.futureclient.installer.pe;
import net.futureclient.installer.pi;
import net.futureclient.installer.pn;
import net.futureclient.installer.pv;
import net.futureclient.installer.px;
import net.futureclient.installer.vA;
import net.futureclient.installer.vC;
import net.futureclient.installer.vJ;
import net.futureclient.installer.vM;
import net.futureclient.installer.vP;
import net.futureclient.installer.vV;
import net.futureclient.installer.vn;
import net.futureclient.installer.vp;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class EF {
    private static final /* synthetic */ String[] c;
    private /* synthetic */ List e;
    private /* synthetic */ Map i;
    private static /* synthetic */ pL X;
    private /* synthetic */ ThreadLocal S;
    private /* synthetic */ boolean m;
    private static final /* synthetic */ String[] b;
    private /* synthetic */ pn F;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private /* synthetic */ boolean O;
    private /* synthetic */ p_ T;

    public static /* synthetic */ vM H(Object[] this_) {
        Closeable closeable = (Reader)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x1C6F05211DBDL;
        closeable = new vM(l3, (Reader)closeable);
        ye.a("F", (Object)closeable, (boolean)false, (long)5737625015689265316L, (long)l2);
        return closeable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void G(Object[] this_) {
        Object object = this_[0];
        long l2 = (Long)this_[1];
        vM vM2 = (vM)this_[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x1F41E41A8B17L;
        try {
            if (object == null) return;
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            if ((e)((Object)ye.a("j", (Object)vM2, (Object)arrobject, (long)-2382257556544981661L, (long)l2)) == (e)((Object)ye.a("Z", (long)-2492993863141627905L, (long)l2))) return;
            throw new h((String)((Object)EF.a("y", (int)12277, (long)(0x23EB0192C91000E3L ^ l2))));
        }
        catch (XU xU) {
            try {
                try {
                    throw (Exception)((Object)ye.a("G", (Object)xU, (long)-2475357052841399978L, (long)l2));
                }
                catch (XU xU2) {
                    throw (Exception)((Object)ye.a("G", (Object)xU2, (long)-2475357052841399978L, (long)l2));
                }
            }
            catch (XU xU3) {
                throw new k(xU3);
            }
            catch (IOException iOException) {
                throw new h(iOException);
            }
        }
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = EF.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        EF.a = wu.a(-8566184657801159506L, 5360672648838441257L, MethodHandles.lookup().lookupClass()).a(252137236908600L);
        var7 = EF.a ^ 38872469571988L;
        var9_1 = var7 ^ 35782600813627L;
        EF.d = new HashMap<K, V>(13);
        var0_2 = Cipher.getInstance(NC.C("{\u0004om\u0005zZHF#P>!:r\tj\u0019*]"));
        v0 = SecretKeyFactory.getInstance(pe.C("`Kt"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var7 >>> 56);
        v3 = var1_3 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var1_3++;
            v2[v4] = (byte)(var7 << v4 * 8 >>> 56);
            v3 = var1_3;
        }
        var0_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var6_4 = new String[10];
        var4_5 = 0;
        var3_6 = NC.C("\u00b5\u00dd\u00b3\nOv\u0093;\u00e5\u00fb\u000e]\u00f1\u0017j\u0019fG\u0010\u0097\u00d1\u001cG\u00b4[\u00ab\u00cf\u00dd\u00e4\u00a2t\u00da!\u00e8qL\u00b88\u00d4\u0001\u00f5rZ\u0017cu\u00a5nj\u00c1|Q\u0087[ \u001d\u00f7\u00d8/S\u00e7\u00cd\u00b51/\u001a1_~\u0087\u0097VN@z\u00be$\u00e1\u00c4\u00a8\u00a1\u00eb}A\u00c0\u0012\u00dc\u00be\u00fdS+\u00bbG\u00165\u008e\u001b~\u00ce?\u0015w\")\u0004`,\u0087\u00cbT=o\u00d2\u00c3)\u001dn\u0085\u000f\u00fd\u008a\u00eb0\tS\u00bc\u00d4)\u00bc%=\u00a4V\u00a7P\u00a1\u00e0\u00ff\u001b\u001b\u00cf\u00ff43\u0084\u00e8T8\u00b8\u0089\u00ecOS\u00e9It\u008b\u00cd\u00ce8JXh\u00e2C\u0007\u00deim\u00a9G^uU\u00acf\u0000a\u00c0\u008fP\u00fa\u0013\u00bc]\u001b\u00be\u00b4\u0098K\u0016\u00dd\u00a4ee\u00f8\u00fd\u00daC\u0084\u00c4\u00e6\u00bc6\u001a\u00bfD,\u001bA_T\u00ac&+I\u0012\u00f8\u009a\u0093'\u0012J\u00fa\u0005\u00bb\u0004\u00c0\u0099V\r\u00b8\u0085\u00f0\u00bf\u008c\u0097\u0005/\u0017\u00f6\u00a17\u00d3\u00d7\u0011\u00dc\u009cQ=\t\u0010\u00b0\u00a6\u0015+{\u00be\u00fb\u0017\u0085E\u0013\u00e0.\u00e7\u00e5\u00b7\u008e\u00ab1\t\u000b\u00ad\u0083\u00bfe\u00bf\u001c\u00cb*\u00b4\u00e2\u0001\u0007{\u00f6\b\u0080\u001af\u00a2U\u00a4\u009e\u00e2\u00b1v^\u00eb\u00a2\u009c\u00f0\u00bf^o\u00e0\u009eRM\u00e2}a0u\u00a9\u00f0\u0094\u0010\u00c3\u000e|f}\u008c\u00aag\u00bdy\u00e0q4q\u00d4K\u00e6\u00ab\u000bo\u009c\u00f8o\u00f7\u00ecz#\u00f92\u0017|b\u00f4\u00ack\u00a8{U\u0085Y\u00fe\u00a6I\u00e1\u008f}u\u00a5vq\u0095\u00d5\u008c\u00d2\u00af\u0088\u00f1\u00d0\u00c1\u001b\u00f1C\u00a0o\u00e8\u00b2\u00c3\u00fbk\u00a2]\u00b03\u00f7&\u00c4\u00dd?\u009f\u0096N\u00edlh\u00b930\u00fb\u00c3\u0087Nk\u00f0\u00ce\u0006\u00a9\u00ba$\u00c50i\u00ff{\u0098\u007fi\u00d8o\u00ea\u00878\u00f8\u00ee3f\u00fdVFU\u00cc\u00ca+\u0084\u00fc\u00023\u00c6\u00a3\u00be\u00ed\u00e7\u000b\u00cf\u00dey{t@\u00dd\u00c2@\u00b5_m\u00ff\u00cd\u00a3}yu\u00e6\u00e8\u009d\u00d70GG\u00e3\u00f1\u00f6n,.\u00f1\u00fd\u00a1\u00cf\u000b\u00c73o\u00c0\u00ce\u0095\u0087\u00c6\u00f1\u00de\u001a\u00e7?\u00e7}\u00e2UY\u00f7\u00b3\u00c8PJy\u0019\u00d4Lzw\u00c0\u00c1\u00dft\u00db\u00ad4X\\,N\u0018'\u0014\u00f8\u00b9\u00a0Y\u0005\u001d\u0092m-` \u00ed\":m\u0017V\u0001\u00978\u00c3\u00e1d\u0000\u00ce\u0016\u0093\u00a3\u001c\u00f5\u00b1E\u00a1\u00c0X\u0000\u00e2e@TA$|\u00c1\u0085\u001aS\u00c3\u001e\u008fd\u0091\u00f1");
        var5_7 = var3_6.length();
        var2_8 = 48;
        var1_3 = -1;
        block4: while (true) {
            v5 = ++var1_3;
            v6 = var3_6.substring(v5, v5 + var2_8);
            v7 = -1;
            ** GOTO lbl76
            {
                var3_6 = pe.C("\u0006I\u008e\u00a7t\u0013]\u00d8\u00b5\u000e\u0085\u00f6T\u00df\u00f1\u00d6\u0084\u0093\u0097\u00af\u009aG\u0092\u001a\u0000\u009e\u0090\u00ba\\\u00dd\u009b\u00a5H\u008e#D\u0000\u00a3\u00927%f\u00d4\u00bb'\u001a\u0003\u00a5\u0005]'2\r\u00e8d\u00da3A\u00cc\u008b\u00b6\u0083[\u00e0\u001b");
                var5_7 = var3_6.length();
                var2_8 = 48;
                var1_3 = -1;
                while (true) {
                    v8 = ++var1_3;
                    v6 = var3_6.substring(v8, v8 + var2_8);
                    v7 = 0;
lbl76:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_4[++var4_5] = EF.a(var0_2.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                            if ((var1_3 += var2_8) >= var5_7) continue block5;
                            var2_8 = var3_6.charAt(var1_3);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_4[++var4_5] = EF.a(var0_2.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                    if ((var1_3 += var2_8) >= var5_7) {
                        EF.b = var6_4;
                        EF.c = new String[10];
                        v9 = new Object[2];
                        v9[1] = Object.class;
                        v9[0] = var9_1;
                        ye.a("\u00ed", (pL)((pL)ye.a("G", (Object)v9, (long)-7494232927148208752L, (long)var7)), (long)-7534173531321386160L, (long)var7);
                        return;
                    }
                    var2_8 = var3_6.charAt(var1_3);
                }
            }
            break;
        }
    }

    public final /* synthetic */ vA D(Object[] object) {
        long l2 = (Long)object[0];
        object = (Class)object[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x63F54A65FE41L;
        long l4 = l2 ^ 0x319D71803312L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l3;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l4;
        arrobject2[0] = (pL)((Object)ye.a("G", (Object)arrobject, (long)-8825540529671659542L, (long)l2));
        return (vA)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-8757108243552873764L, (long)l2));
    }

    public final /* synthetic */ Object L(Object[] object) {
        Object object2;
        Object[] arrobject = object;
        object = (pi)object[0];
        long l2 = (Long)arrobject[1];
        Class class_ = (Class)arrobject[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x1317470E39D7L;
        long l4 = l2 ^ 0x10B36F7755EFL;
        long l5 = l2 ^ 0x49B0F8300B2CL;
        Class class_2 = class_;
        Object object3 = object;
        object = this;
        try {
            if (object3 == null) {
                object2 = null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (Exception)((Object)ye.a("G", (Object)illegalArgumentException, (long)-2291855808195570494L, (long)l2));
        }
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = class_2;
        arrobject2[1] = l4;
        arrobject2[0] = new vJ((pi)object3, l3);
        object2 = ye.a("j", (Object)object, (Object)arrobject2, (long)-2234111620735355884L, (long)l2);
        object = object2;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = class_;
        arrobject3[0] = l5;
        return ye.a("j", (Object)((Class)((Object)ye.a("G", (Object)arrobject3, (long)-2166250927775987609L, (long)l2))), (Object)object, (long)-2067806296243225749L, (long)l2);
    }

    public /* synthetic */ EF(long l22, NZ nZ, NE nE, Map this22, boolean this32, boolean this42, Q q2, List list) {
        vA vA2;
        long l22 = a ^ l22;
        long l3 = l22 ^ 0x4F8C04812CDFL;
        long l4 = l22 ^ 0x16ABA3B64746L;
        CallSite callSite = ye.a("G", (long)8728860776337118272L, (long)l22);
        CallSite callSite2 = callSite;
        EF eF = this;
        EF eF2 = this;
        eF2.S = new ThreadLocal();
        EF eF3 = this;
        eF2.i = new ConcurrentHashMap();
        EF eF4 = this;
        eF3.F = new pn((Map)this22, l4);
        eF.m = this32;
        eF.O = this42;
        Object this22 = new ArrayList();
        try {
            ye.a("j", this22, (Object)pv.a, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)vC.y, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)nZ, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)list, (long)8884841839935614909L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.B, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.t, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.w, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.L, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.H, (long)8717921886162039453L, (long)l22);
            vA2 = q2 == Q.a ? pv.X : new pO();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (Exception)((Object)ye.a("G", (Object)illegalArgumentException, (long)8707971662730742827L, (long)l22));
        }
        vA this32 = vA2;
        Object[] arrobject = new Object[3];
        arrobject[2] = this32;
        arrobject[1] = Long.class;
        arrobject[0] = (Class)((Object)ye.a("Z", (long)8907121961032032189L, (long)l22));
        ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject, (long)8917450579922373643L, (long)l22))), (long)8717921886162039453L, (long)l22);
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = new pS();
        arrobject2[1] = Double.class;
        arrobject2[0] = (Class)((Object)ye.a("Z", (long)8724452146390258000L, (long)l22));
        ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject2, (long)8917450579922373643L, (long)l22))), (long)8717921886162039453L, (long)l22);
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = new p7();
        arrobject3[1] = Float.class;
        arrobject3[0] = (Class)((Object)ye.a("Z", (long)8716839363469245531L, (long)l22));
        ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject3, (long)8917450579922373643L, (long)l22))), (long)8717921886162039453L, (long)l22);
        ye.a("j", (Object)this22, (Object)pv.C, (long)8717921886162039453L, (long)l22);
        ye.a("j", (Object)this22, (Object)pv.J, (long)8717921886162039453L, (long)l22);
        ye.a("j", (Object)this22, (Object)pv.N, (long)8717921886162039453L, (long)l22);
        vA this42 = this32;
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (vA)((Object)ye.a("j", (Object)new p9(this42), (Object)new Object[0], (long)8662927411875969564L, (long)l22));
        arrobject4[0] = AtomicLong.class;
        ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject4, (long)8738521095430934970L, (long)l22))), (long)8717921886162039453L, (long)l22);
        this42 = this32;
        try {
            Object[] arrobject5 = new Object[2];
            arrobject5[1] = (vA)((Object)ye.a("j", (Object)new pa(this42), (Object)new Object[0], (long)8662927411875969564L, (long)l22));
            arrobject5[0] = AtomicLongArray.class;
            ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject5, (long)8738521095430934970L, (long)l22))), (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.b, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.u, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.o, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.M, (long)8717921886162039453L, (long)l22);
            Object[] arrobject6 = new Object[2];
            arrobject6[1] = pv.S;
            arrobject6[0] = BigDecimal.class;
            ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject6, (long)8738521095430934970L, (long)l22))), (long)8717921886162039453L, (long)l22);
            Object[] arrobject7 = new Object[2];
            arrobject7[1] = pv.Q;
            arrobject7[0] = BigInteger.class;
            ye.a("j", (Object)this22, (Object)((Nk)((Object)ye.a("G", (Object)arrobject7, (long)8738521095430934970L, (long)l22))), (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.Z, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.P, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.y, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.e, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.c, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.p, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.x, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)vV.O, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.D, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)vn.C, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)vP.o, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.R, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)vp.u, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.j, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)new px(this.F), (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)new XP(this.F), (long)8717921886162039453L, (long)l22);
            EF eF5 = this;
            this.T = new p_(this.F);
            ye.a("j", (Object)this22, (Object)this.T, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)pv.i, (long)8717921886162039453L, (long)l22);
            ye.a("j", (Object)this22, (Object)new i(this.F, nE, nZ, l3), (long)8717921886162039453L, (long)l22);
            this.e = (List)((Object)ye.a("G", (Object)this22, (long)8929315882079876584L, (long)l22));
            if (l22 >= 0L && callSite2 == null) {
                ye.a("G", pe.C("'\u0019BWGD"), (long)8662592890931223045L, (long)l22);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (Exception)((Object)ye.a("G", (Object)illegalArgumentException, (long)8707971662730742827L, (long)l22));
        }
    }

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void m(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
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
     * Exception decompiling
     */
    public final /* synthetic */ vA v(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[TRYBLOCK]
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
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ vA O(Object[] this) {
        block10: {
            block11: {
                var5_3 = (Integer)this /* !! */ [0];
                var4_4 = (Nk)this /* !! */ [1];
                var2_5 = (Integer)this /* !! */ [2];
                this = (pL)this /* !! */ [3];
                var3_7 = (Integer)this /* !! */ [4];
                var6_10 = ((long)var5_3 << 48 | (long)var2_5 << 32 >>> 16 | (long)var3_7 << 48 >>> 48) ^ EF.a;
                var8_11 = var6_10 ^ 74363145853592L;
                var2_6 = ye.a("G", (long)-7313826725115332637L, (long)var6_10);
                try {
                    v0 /* !! */  = ye.a("j", (Object)((List)ye.a("\u00c3", (Object)this, (long)-7283638123897883176L, (long)var6_10)), (Object)var4_4, (long)-7225623917919151038L, (long)var6_10);
                    if (var2_6 == null) break block10;
                    if (v0 /* !! */  != false) break block11;
                }
                catch (IllegalArgumentException v1) {
                    throw (Exception)ye.a("G", (Object)v1, (long)-7242953752780722296L, (long)var6_10);
                }
                var4_4 = (p_)ye.a("\u00c3", (Object)this, (long)-7262255478289957628L, (long)var6_10);
            }
            v0 /* !! */  = (CallSite)false;
        }
        var3_8 = v0 /* !! */ ;
        var10_12 = (Iterator)ye.a("j", (Object)((List)ye.a("\u00c3", (Object)this, (long)-7283638123897883176L, (long)var6_10)), (long)-7478486476278206083L, (long)var6_10);
        block6: while (true) lbl-1000:
        // 4 sources

        {
            v2 /* !! */  = ye.a("j", (Object)var10_12, (long)-7257001322558905960L, (long)var6_10);
            block7: while (v2 /* !! */  != false) {
                v3 = ye.a("j", (Object)var10_12, (long)-7424224136528217713L, (long)var6_10);
                do {
                    block14: {
                        block13: {
                            block12: {
                                var11_13 = (Nk)v3;
                                try {
                                    if (var3_9 /* !! */  != false) break block12;
                                    if (var11_13 != var4_4) ** GOTO lbl-1000
                                }
                                catch (IllegalArgumentException v4) {
                                    throw (Exception)ye.a("G", (Object)v4, (long)-7242953752780722296L, (long)var6_10);
                                }
                                v2 /* !! */  = (CallSite)true;
                                if (var5_3 < 0) continue block7;
                                var3_9 /* !! */  = v2 /* !! */ ;
                                if (var2_6 != null) ** GOTO lbl-1000
                            }
                            v5 = new Object[3];
                            v5[2] = this;
                            v5[1] = var8_11;
                            v5[0] = this;
                            var11_13 = (vA)ye.a("j", (Object)var11_13, (Object)v5, (long)-7270938478818449250L, (long)var6_10);
                            try {
                                if (var2_6 == null) break block13;
                                if (var11_13 != null) {
                                    return var11_13;
                                }
                                break block14;
                            }
                            catch (IllegalArgumentException v6) {
                                throw (Exception)ye.a("G", (Object)v6, (long)-7242953752780722296L, (long)var6_10);
                            }
                        }
                        return var11_13;
                    }
                    if (var2_6 != null) continue block6;
                    v3 = new IllegalArgumentException((String)ye.a("j", (String)EF.a("y", (int)13907, (long)(1532939567214157721L ^ var6_10)), (Object)((String)ye.a("G", (Object)this, (long)-7477069196768614825L, (long)var6_10)), (long)-7428340563911518229L, (long)var6_10));
                } while (var5_3 < 0);
            }
            break;
        }
        throw v3;
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

    /*
     * Exception decompiling
     */
    public final /* synthetic */ String c(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 11[CATCHBLOCK]
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

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x7ED6440C6FD5L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)EF.a("y", (int)26463, (long)(0x5C6BA0743F0AE7EBL ^ l2)))), (Object)((List)((Object)ye.a("\u00c3", (Object)this, (long)8328033411246005408L, (long)l2))), (long)8221690007554152023L, (long)l2))), (Object)((String)((Object)EF.a("y", (int)22911, (long)(0x368135EAD6DE59CCL ^ l2)))), (long)8173388767644889562L, (long)l2))), (Object)((pn)((Object)ye.a("\u00c3", (Object)this, (long)8180381008795553396L, (long)l2))), (long)8221690007554152023L, (long)l2))), (Object)pe.C("Z"), (long)8173388767644889562L, (long)l2))), (long)8251336067781924405L, (long)l2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x7052;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(pe.C("\u007fWo:jBg\"tFnW\u000fC\u0007+iM`@"));
                    arrobject[1] = SecretKeyFactory.getInstance(NC.C("\u0006^6"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(pe.C("aYaI)T|S}^qP|LnP\"Mc^p[\u007f\n*\u007f\u000bKa"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NC.C("A%\u001b\u0007\u0007y\t{6T"));
            EF.c[n2] = EF.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    public final /* synthetic */ Object U(Object[] object) {
        Object[] arrobject = object;
        object = (Reader)object[0];
        int n2 = (Integer)arrobject[1];
        int n3 = (Integer)arrobject[2];
        Class class_ = (Class)arrobject[3];
        int n4 = (Integer)arrobject[4];
        long l2 = ((long)n2 << 48 | (long)n3 << 32 >>> 16 | (long)n4 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x26162CF8B56AL;
        long l4 = l2 ^ 0x39B7DF6527A4L;
        long l5 = l2 ^ 0x75E187F350EAL;
        long l6 = l2 ^ 0x2CE210B40E29L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        object = (vM)((Object)ye.a("G", (Object)arrobject2, (long)-1928319881621043421L, (long)l2));
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = class_;
        arrobject3[1] = l5;
        arrobject3[0] = object;
        Object object2 = ye.a("j", (Object)this, (Object)arrobject3, (long)-1874709090929004271L, (long)l2);
        Object[] arrobject4 = new Object[3];
        arrobject4[2] = object;
        arrobject4[1] = l4;
        arrobject4[0] = object2;
        ye.a("G", (Object)arrobject4, (long)-1826906083258970808L, (long)l2);
        Object[] arrobject5 = new Object[2];
        arrobject5[1] = class_;
        arrobject5[0] = l6;
        return ye.a("j", (Object)((Class)((Object)ye.a("G", (Object)arrobject5, (long)-1951594584403784350L, (long)l2))), (Object)object2, (long)-1853010846379196818L, (long)l2);
    }

    public final /* synthetic */ Object X(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = (Type)arrobject[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x4C6321A6DE07L;
        long l4 = l2 ^ 0x5317BC8CFC59L;
        long l5 = l2 ^ 0x52CC484AAB83L;
        long l6 = l2 ^ 0x34C2F24F1FC1L;
        boolean bl = true;
        CallSite callSite = ye.a("\u00c3", (Object)object, (long)-6187822215069293276L, (long)l2);
        ye.a("F", (Object)object, (boolean)true, (long)-6187822215069293276L, (long)l2);
        try {
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l4;
            e cfr_ignored_0 = (e)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)-6215309392645782995L, (long)l2));
            bl = false;
            Object[] arrobject3 = new Object[2];
            arrobject3[1] = l5;
            arrobject3[0] = object2;
            object2 = (pL)((Object)ye.a("G", (Object)arrobject3, (long)-6160457670472912139L, (long)l2));
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = l6;
            arrobject4[0] = object2;
            Object[] arrobject5 = new Object[2];
            arrobject5[1] = l3;
            arrobject5[0] = object;
            object2 = ye.a("j", (Object)((vA)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)-6148674439657685489L, (long)l2))), (Object)arrobject5, (long)-6224523458996981529L, (long)l2);
            return object2;
        }
        catch (EOFException eOFException) {
            if (bl) {
                Object var2_5 = null;
                return var2_5;
            }
            throw new k(eOFException);
        }
        catch (IllegalStateException illegalStateException) {
            throw new k(illegalStateException);
        }
        catch (IOException iOException) {
            throw new k(iOException);
        }
        catch (AssertionError assertionError) {
            throw new AssertionError((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)EF.a("y", (int)16731, (long)(0x4203BB5848CE1906L ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)assertionError, (long)-6196675513803470574L, (long)l2))), (long)-6231382735122142926L, (long)l2))), (long)-6166912493136621859L, (long)l2)), (Throwable)((Object)assertionError));
        }
        finally {
            ye.a("F", (Object)object, (boolean)callSite, (long)-6187822215069293276L, (long)l2);
        }
    }

    public /* synthetic */ EF(long l22, char c2) {
        long l22 = (l22 << 16 | (long)c2 << 48 >>> 48) ^ a ^ 0x7C5F2BDA0FBEL;
        Map map = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        this(l22, NZ.l, NF.a, map, true, false, Q.a, Collections.emptyList());
    }
}

