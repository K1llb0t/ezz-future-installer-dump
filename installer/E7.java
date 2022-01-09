/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Xb;
import net.futureclient.installer.d;
import net.futureclient.installer.vc;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class E7 {
    private /* synthetic */ Object[] F;
    private static final /* synthetic */ long a;
    private /* synthetic */ String X;
    private static final /* synthetic */ String c;
    private /* synthetic */ vc E;
    private /* synthetic */ String h;

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x651EFE171C3AL;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)8617015726631880259L, (long)l2))), (long)8384489907688584428L, (long)l2))), (Object)c, (long)8384489907688584428L, (long)l2))), (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)8521062448470414307L, (long)l2))), (long)8384489907688584428L, (long)l2))), (char)' ', (long)8605897322667009763L, (long)l2))), (Object)((vc)((Object)ye.a("\u00c3", (Object)this, (long)8547348957428329885L, (long)l2))), (long)8588165898993455969L, (long)l2))), (char)' ', (long)8605897322667009763L, (long)l2))), (Object)((String)((Object)ye.a("G", (Object)((Object[])ye.a("\u00c3", (Object)this, (long)8377880163292551104L, (long)l2)), (long)8528441259696301087L, (long)l2))), (long)8384489907688584428L, (long)l2))), (long)8625702314508194563L, (long)l2));
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
    public final /* synthetic */ boolean equals(Object this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
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

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x6EAE6BB3C984L;
        return ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)-6761097563086138371L, (long)l2)), (long)-6702142563419389495L, (long)l2) ^ ye.a("G", (int)ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)-6629599269532006819L, (long)l2)), (long)-6702142563419389495L, (long)l2), (int)8, (long)-6696300368491602837L, (long)l2) ^ ye.a("G", (int)ye.a("j", (Object)((vc)((Object)ye.a("\u00c3", (Object)this, (long)-6692275207740655581L, (long)l2))), (long)-6841046047551460537L, (long)l2), (int)16, (long)-6696300368491602837L, (long)l2) ^ ye.a("G", (int)ye.a("G", (Object)((Object[])ye.a("\u00c3", (Object)this, (long)-6775034320886381954L, (long)l2)), (long)-6699860849255227195L, (long)l2), (int)24, (long)-6696300368491602837L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(408510322698788238L, -7020425318593629335L, MethodHandles.lookup().lookupClass()).a(170041981315292L);
        long l2 = a ^ 0x5796DD022EE6L;
        Cipher cipher = Cipher.getInstance(d.C("W{2c)\u0005v7j\\|A\rE^vFf\u0006\""));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Xb.C("\u0000de"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                c = E7.a(cipher.doFinal(d.C("\u00c3\u00ff\u00c6L\u0080\rh\u0082").getBytes(Xb.C(":7+^\u0000\u0017f}\f\u0007")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    public /* synthetic */ E7(String string, String string2, vc vc2, Object[] arrobject) {
        E7 e7 = this;
        E7 e72 = this;
        e72.X = string;
        e72.h = string2;
        e7.E = vc2;
        e7.F = arrobject;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }
}

