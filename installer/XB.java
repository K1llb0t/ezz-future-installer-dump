/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.futureclient.installer.N5
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.AbstractQueue;
import java.util.Iterator;
import net.futureclient.installer.N5;
import net.futureclient.installer.NI;
import net.futureclient.installer.XH;
import net.futureclient.installer.p8;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class XB
extends AbstractQueue {
    public final /* synthetic */ p8 P;
    private static final /* synthetic */ long a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ p8 u(Object[] object) {
        p8 p82;
        p8 p83;
        block4: {
            long l2 = (Long)object[0];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x794921CB83FAL;
            object = ye.a("G", (long)-5449556763834918596L, (long)l2);
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            p82 = p83 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)-5371396215387939144L, (long)l2))), (Object)arrobject, (long)-5321930277718951652L, (long)l2));
            try {
                if (object == null) return p82;
                if (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)-5371396215387939144L, (long)l2))) break block4;
                return null;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-5282410087914863496L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-5282410087914863496L, (long)l2));
                }
            }
        }
        p82 = p83;
        return p82;
    }

    @Override
    public final /* synthetic */ int size() {
        long l2 = a ^ 0x635D193F82DBL;
        long l3 = l2 ^ 0x756CE74174B3L;
        int n2 = 0;
        CallSite callSite = ye.a("G", (long)4834126956523957877L, (long)l2);
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        p8 p82 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)4773247965481822705L, (long)l2))), (Object)arrobject, (long)4714627511976234581L, (long)l2));
        while (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)4773247965481822705L, (long)l2))) {
            ++n2;
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l3;
            p82 = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)4714627511976234581L, (long)l2));
            if (callSite != null) continue;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ boolean contains(Object object) {
        long l2 = a ^ 0x114FC0E04B6BL;
        long l3 = l2 ^ 0x77E3E9EBD03L;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            if ((p8)((Object)ye.a("j", (Object)((p8)object), (Object)arrobject, (long)-8584482470680901659L, (long)l2)) != (N5)ye.a("Z", (long)-8620665646745465069L, (long)l2)) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-8626537109933507967L, (long)l2));
        }
        return false;
    }

    @Override
    public final /* synthetic */ void clear() {
        block3: {
            XB xB;
            long l2;
            long l3;
            long l4;
            block4: {
                l4 = a ^ 0x796A161EC266L;
                l3 = l4 ^ 0x5ECF303B4DCBL;
                long l5 = l4 ^ 0x6F5BE860340EL;
                l2 = l4 ^ 0x136D3E5BC6CEL;
                long l6 = l4 ^ 0x4FC78254EF3CL;
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                p8 p82 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)180391972484622668L, (long)l4))), (Object)arrobject, (long)130783099503103720L, (long)l4));
                CallSite callSite = ye.a("G", (long)264409378451451592L, (long)l4);
                while (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)180391972484622668L, (long)l4))) {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l5;
                    p8 p83 = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)130783099503103720L, (long)l4));
                    Object[] arrobject3 = new Object[2];
                    arrobject3[1] = l6;
                    arrobject3[0] = p82;
                    ye.a("G", (Object)arrobject3, (long)281625868527924576L, (long)l4);
                    p82 = p83;
                    try {
                        if (callSite == null) break block3;
                        if (callSite != null) continue;
                        xB = this;
                        break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)91490439425602444L, (long)l4));
                    }
                }
                xB = this;
            }
            Object[] arrobject = new Object[2];
            arrobject[1] = (p8)((Object)ye.a("\u00c3", (Object)this, (long)180391972484622668L, (long)l4));
            arrobject[0] = l2;
            ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)xB, (long)180391972484622668L, (long)l4))), (Object)arrobject, (long)89461434203290313L, (long)l4);
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = l3;
            arrobject4[0] = (p8)((Object)ye.a("\u00c3", (Object)this, (long)180391972484622668L, (long)l4));
            ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)180391972484622668L, (long)l4))), (Object)arrobject4, (long)146843232012683820L, (long)l4);
        }
    }

    @Override
    public final /* synthetic */ boolean offer(Object object) {
        long l2 = a ^ 0x28A39837EF85L;
        long l3 = l2 ^ 0x3E92664919EDL;
        long l4 = l2 ^ 0xF68FA827AC6L;
        long l5 = l2 ^ 0x2BC7BD95E153L;
        p8 p82 = (p8)object;
        object = this;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)3185156820681941771L, (long)l2));
        arrobject3[1] = l5;
        arrobject3[0] = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject, (long)3447244452240984073L, (long)l2));
        ye.a("G", (Object)arrobject3, (long)3328038541350982398L, (long)l2);
        Object[] arrobject4 = new Object[1];
        arrobject4[0] = l4;
        Object[] arrobject5 = new Object[3];
        arrobject5[2] = p82;
        arrobject5[1] = l5;
        arrobject5[0] = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)object, (long)3414766742649308335L, (long)l2))), (Object)arrobject4, (long)3447244452240984073L, (long)l2));
        ye.a("G", (Object)arrobject5, (long)3328038541350982398L, (long)l2);
        Object[] arrobject6 = new Object[3];
        arrobject6[2] = (p8)((Object)ye.a("\u00c3", (Object)object, (long)3414766742649308335L, (long)l2));
        arrobject6[1] = l5;
        arrobject6[0] = p82;
        ye.a("G", (Object)arrobject6, (long)3328038541350982398L, (long)l2);
        return true;
    }

    @Override
    public final /* synthetic */ Object peek() {
        long l2 = a ^ 0x17FC5207E7DCL;
        long l3 = l2 ^ 0x5135CA5F509BL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (p8)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)2643477909076004950L, (long)l2));
    }

    @Override
    public final /* synthetic */ boolean remove(Object object) {
        long l2 = a ^ 0x65AF8C5B6DA9L;
        long l3 = l2 ^ 0x739E72259BC1L;
        long l4 = l2 ^ 0x4264EEEEF8EAL;
        long l5 = l2 ^ 0x5302181140F3L;
        long l6 = l2 ^ 0x66CBA9F9637FL;
        object = (p8)object;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        p8 p82 = (p8)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)-5910024959393134043L, (long)l2));
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        p8 p83 = (p8)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)-5899787750407380697L, (long)l2));
        try {
            Object[] arrobject3 = new Object[3];
            arrobject3[2] = p83;
            arrobject3[1] = l6;
            arrobject3[0] = p82;
            ye.a("G", (Object)arrobject3, (long)-6051751136558034734L, (long)l2);
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = l5;
            arrobject4[0] = object;
            ye.a("G", (Object)arrobject4, (long)-6041695475605742929L, (long)l2);
            if (p83 != (N5)ye.a("Z", (long)-5863886117502588463L, (long)l2)) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-5869854062454039485L, (long)l2));
        }
        return false;
    }

    public /* synthetic */ XB() {
        XB xB = this;
        xB.P = new XH();
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        long l2 = a ^ 0x3F3297EA2271L;
        long l3 = l2 ^ 0x79FB0FB29536L;
        XB xB = this;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return new NI(xB, (p8)((Object)ye.a("j", (Object)xB, (Object)arrobject, (long)-2233031245561031173L, (long)l2)));
    }

    @Override
    public final /* synthetic */ boolean isEmpty() {
        long l2 = a ^ 0x50C260D0A5BFL;
        long l3 = l2 ^ 0x46F39EAE53D7L;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            if ((p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)7303088325127655061L, (long)l2))), (Object)arrobject, (long)7352560841755961649L, (long)l2)) == (p8)((Object)ye.a("\u00c3", (Object)this, (long)7303088325127655061L, (long)l2))) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)7393823968135795797L, (long)l2));
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object poll() {
        p8 p82;
        p8 p83;
        XB xB;
        long l2;
        block4: {
            l2 = a ^ 0x500124972C9BL;
            long l3 = l2 ^ 0x4630DAE9DAF3L;
            CallSite callSite = ye.a("G", (long)-1344756017163370443L, (long)l2);
            xB = this;
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            p82 = p83 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)xB, (long)-1405746643687520335L, (long)l2))), (Object)arrobject, (long)-1212158921678512107L, (long)l2));
            try {
                if (callSite == null) return p82;
                if (p82 != (p8)((Object)ye.a("\u00c3", (Object)xB, (long)-1405746643687520335L, (long)l2))) break block4;
                return null;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-1173148692467196559L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-1173148692467196559L, (long)l2));
                }
            }
        }
        ye.a("j", (Object)xB, (Object)p83, (long)-1406373302003055899L, (long)l2);
        p82 = p83;
        return p82;
    }

    public static /* synthetic */ {
        a = wu.a(-9009626596986370820L, 7668760911357790258L, MethodHandles.lookup().lookupClass()).a(247925207146339L);
    }
}

