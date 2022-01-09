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
import net.futureclient.installer.Nm;
import net.futureclient.installer.Xx;
import net.futureclient.installer.p8;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class pz
extends AbstractQueue {
    public final /* synthetic */ p8 J;
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ boolean offer(Object object) {
        long l2 = a ^ 0x22BFFCD8187DL;
        long l3 = l2 ^ 0x11B54A1DC11CL;
        long l4 = l2 ^ 0x361825FC05AFL;
        long l5 = l2 ^ 0x3D4CE3C5750BL;
        p8 p82 = (p8)object;
        object = this;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)5751123021266273674L, (long)l2));
        arrobject3[1] = l5;
        arrobject3[0] = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject, (long)5741598662587748203L, (long)l2));
        ye.a("G", (Object)arrobject3, (long)5573201468184421163L, (long)l2);
        Object[] arrobject4 = new Object[1];
        arrobject4[0] = l4;
        Object[] arrobject5 = new Object[3];
        arrobject5[2] = p82;
        arrobject5[1] = l5;
        arrobject5[0] = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)object, (long)5482298491823416369L, (long)l2))), (Object)arrobject4, (long)5741598662587748203L, (long)l2));
        ye.a("G", (Object)arrobject5, (long)5573201468184421163L, (long)l2);
        Object[] arrobject6 = new Object[3];
        arrobject6[2] = (p8)((Object)ye.a("\u00c3", (Object)object, (long)5482298491823416369L, (long)l2));
        arrobject6[1] = l5;
        arrobject6[0] = p82;
        ye.a("G", (Object)arrobject6, (long)5573201468184421163L, (long)l2);
        return true;
    }

    @Override
    public final /* synthetic */ boolean isEmpty() {
        long l2 = a ^ 0x6CB6A80D2260L;
        long l3 = l2 ^ 0x5FBC1EC8FB01L;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            if ((p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)8505126407639031340L, (long)l2))), (Object)arrobject, (long)8488539706620968855L, (long)l2)) == (p8)((Object)ye.a("\u00c3", (Object)this, (long)8505126407639031340L, (long)l2))) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8621831195816280891L, (long)l2));
        }
        return false;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object poll() {
        p8 p82;
        p8 p83;
        pz pz2;
        long l2;
        block4: {
            l2 = a ^ 0x9BCFA5CF891L;
            long l3 = l2 ^ 0x3AB64C9921F0L;
            CallSite callSite = ye.a("G", (long)-5923859238208814935L, (long)l2);
            pz2 = this;
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            p82 = p83 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)pz2, (long)-5982712776100969251L, (long)l2))), (Object)arrobject, (long)-5819709643812690586L, (long)l2));
            try {
                if (callSite == null) return p82;
                if (p82 != (p8)((Object)ye.a("\u00c3", (Object)pz2, (long)-5982712776100969251L, (long)l2))) break block4;
                return null;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-5956150417395869238L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-5956150417395869238L, (long)l2));
                }
            }
        }
        ye.a("j", (Object)pz2, (Object)p83, (long)-5819869477032003695L, (long)l2);
        p82 = p83;
        return p82;
    }

    @Override
    public final /* synthetic */ void clear() {
        block3: {
            pz pz2;
            long l2;
            long l3;
            long l4;
            block4: {
                l4 = a ^ 0x82B0D0BF749L;
                long l5 = l4 ^ 0x3B21BBCE2E28L;
                l3 = l4 ^ 0x280880D118C5L;
                l2 = l4 ^ 0x177BC5EE0D50L;
                long l6 = l4 ^ 0x4DAC5192A9FCL;
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                p8 p82 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)-6692028012565067003L, (long)l4))), (Object)arrobject, (long)-6853285120636998978L, (long)l4));
                CallSite callSite = ye.a("G", (long)-6768284620766916751L, (long)l4);
                while (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)-6692028012565067003L, (long)l4))) {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l5;
                    p8 p83 = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)-6853285120636998978L, (long)l4));
                    Object[] arrobject3 = new Object[2];
                    arrobject3[1] = l6;
                    arrobject3[0] = p82;
                    ye.a("G", (Object)arrobject3, (long)-6769764449921891415L, (long)l4);
                    p82 = p83;
                    try {
                        if (callSite == null) break block3;
                        if (callSite != null) continue;
                        pz2 = this;
                        break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-6733020705471588846L, (long)l4));
                    }
                }
                pz2 = this;
            }
            Object[] arrobject = new Object[2];
            arrobject[1] = l3;
            arrobject[0] = (p8)((Object)ye.a("\u00c3", (Object)this, (long)-6692028012565067003L, (long)l4));
            ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)pz2, (long)-6692028012565067003L, (long)l4))), (Object)arrobject, (long)-6859983161367104181L, (long)l4);
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = (p8)((Object)ye.a("\u00c3", (Object)this, (long)-6692028012565067003L, (long)l4));
            arrobject4[0] = l2;
            ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)-6692028012565067003L, (long)l4))), (Object)arrobject4, (long)-6862933903994452730L, (long)l4);
        }
    }

    public static /* synthetic */ {
        a = wu.a(-8149491754554727902L, 2461851348723478789L, MethodHandles.lookup().lookupClass()).a(19771642118898L);
    }

    public /* synthetic */ pz() {
        pz pz2 = this;
        pz2.J = new Xx();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ p8 c(Object[] object) {
        p8 p82;
        p8 p83;
        block4: {
            long l2 = (Long)object[0];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x2D93EDE4D1EL;
            object = ye.a("G", (long)-4529494192071463865L, (long)l2);
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            p82 = p83 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)-4605183493892675533L, (long)l2))), (Object)arrobject, (long)-4336398514630801016L, (long)l2));
            try {
                if (object == null) return p82;
                if (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)-4605183493892675533L, (long)l2))) break block4;
                return null;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-4487352487978437340L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-4487352487978437340L, (long)l2));
                }
            }
        }
        p82 = p83;
        return p82;
    }

    @Override
    public final /* synthetic */ Object peek() {
        long l2 = a ^ 0x1F0715E9F1ABL;
        long l3 = l2 ^ 0x103654993397L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (p8)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-6563287850047623631L, (long)l2));
    }

    @Override
    public final /* synthetic */ int size() {
        long l2 = a ^ 0x42DBFD9099BFL;
        long l3 = l2 ^ 0x71D14B5540DEL;
        int n2 = 0;
        CallSite callSite = ye.a("G", (long)-3682693183832481401L, (long)l2);
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        p8 p82 = (p8)((Object)ye.a("j", (Object)((p8)((Object)ye.a("\u00c3", (Object)this, (long)-3614304681913489933L, (long)l2))), (Object)arrobject, (long)-3597681697200716728L, (long)l2));
        while (p82 != (p8)((Object)ye.a("\u00c3", (Object)this, (long)-3614304681913489933L, (long)l2))) {
            ++n2;
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l3;
            p82 = (p8)((Object)ye.a("j", (Object)p82, (Object)arrobject2, (long)-3597681697200716728L, (long)l2));
            if (callSite != null) continue;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ boolean contains(Object object) {
        long l2 = a ^ 0x3BC48FE35641L;
        long l3 = l2 ^ 0x8CE39268F20L;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            if ((p8)((Object)ye.a("j", (Object)((p8)object), (Object)arrobject, (long)138501707513367478L, (long)l2)) != (N5)ye.a("Z", (long)135393434492421807L, (long)l2)) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)254368411271608090L, (long)l2));
        }
        return false;
    }

    @Override
    public final /* synthetic */ boolean remove(Object object) {
        long l2 = a ^ 0x934737E47FEL;
        long l3 = l2 ^ 0x3A3EC5BB9E9FL;
        long l4 = l2 ^ 0x1D93AA5A5A2CL;
        long l5 = l2 ^ 0x16C76C632A88L;
        long l6 = l2 ^ 0x4CB32FE7194BL;
        object = (p8)object;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        p8 p82 = (p8)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)1165704545871909096L, (long)l2));
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        p8 p83 = (p8)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)1176350316216687113L, (long)l2));
        try {
            Object[] arrobject3 = new Object[3];
            arrobject3[2] = p83;
            arrobject3[1] = l5;
            arrobject3[0] = p82;
            ye.a("G", (Object)arrobject3, (long)1356945501483121832L, (long)l2);
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = l6;
            arrobject4[0] = object;
            ye.a("G", (Object)arrobject4, (long)1349943022231696158L, (long)l2);
            if (p83 != (N5)ye.a("Z", (long)1179434494546564880L, (long)l2)) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)1312940338497824421L, (long)l2));
        }
        return false;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        long l2 = a ^ 0x265231BB4B2CL;
        long l3 = l2 ^ 0x296370CB8910L;
        pz pz2 = this;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return new Nm(pz2, (p8)((Object)ye.a("j", (Object)pz2, (Object)arrobject, (long)2192616591468041398L, (long)l2)));
    }
}

