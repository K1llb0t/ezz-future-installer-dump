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
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.V;
import net.futureclient.installer.XU;
import net.futureclient.installer.v1;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class P
implements V {
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map f;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] e;
    private static final /* synthetic */ Logger K;

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = P.a(this222, l2);
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
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x5065;
        if (e[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])f.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(v1.C("G\u0001WlR\u0014_tL\u0010V\u00017\u0015?}D\u000e\u007f1"));
                    arrobject[1] = SecretKeyFactory.getInstance(XU.C("#}\u0005"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    f.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(v1.C("j&*6\u007f+j,q!g/x3r/32{!v$2uE\u0015>\u0006"), exception);
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
            byte[] arrby2 = c[n2].getBytes(XU.C("u\u0001dhO!<^\u0015g"));
            P.e[n2] = P.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return e[n2];
    }

    @Override
    public /* synthetic */ boolean isCancelled() {
        return false;
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

    @Override
    public final /* synthetic */ void A(Object[] object) {
        Runnable runnable = (Runnable)object[0];
        object = (Executor)object[1];
        long l2 = (Long)object[2];
        long l3 = l2 ^ 0x51930CEFBB61L;
        Object[] arrobject = new Object[3];
        arrobject[2] = (String)((Object)P.a("u", (int)20209, (long)(0x318F298F7301F791L ^ l2)));
        arrobject[1] = runnable;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)7739015056829827610L, (long)l2);
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = (String)((Object)P.a("u", (int)18939, (long)(0x49519444DD877098L ^ l2)));
        arrobject2[1] = object;
        arrobject2[0] = l3;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)7739015056829827610L, (long)l2);
        try {
            ye.a("j", (Object)object, (Object)runnable, (long)7642297345794169631L, (long)l2);
            return;
        }
        catch (RuntimeException runtimeException) {
            ye.a("j", (Object)((Logger)((Object)ye.a("Z", (long)7750126846267259789L, (long)l2))), (Object)((Level)((Object)ye.a("Z", (long)7746207214146126252L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)P.a("u", (int)26063, (long)(0x3CD7D7E4BD2CDCADL ^ l2)))), (Object)runnable, (long)7781776527007731632L, (long)l2))), (Object)((String)((Object)P.a("u", (int)7158, (long)(0x6D83B35B2C2EA297L ^ l2)))), (long)7532999088690964541L, (long)l2))), (Object)object, (long)7781776527007731632L, (long)l2))), (long)7738733828161834962L, (long)l2))), (Object)runtimeException, (long)7550236271630986863L, (long)l2);
            return;
        }
    }

    @Override
    public /* synthetic */ boolean isDone() {
        return true;
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

    public abstract /* synthetic */ Object get();

    public /* synthetic */ Object get(long l2, TimeUnit timeUnit) {
        long l3 = a ^ 0x543A7A084357L;
        long l4 = l3 ^ 0x4E67D77E248FL;
        Object[] arrobject = new Object[2];
        arrobject[1] = timeUnit;
        arrobject[0] = l4;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-4951659442489999377L, (long)l3);
        return ye.a("j", (Object)this, (long)-5129082927248097831L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        P.a = wu.a(-4351509998429648178L, -3439949872063540441L, MethodHandles.lookup().lookupClass()).a(202528053269274L);
        var7 = P.a ^ 136937408672215L;
        P.f = new HashMap<K, V>(13);
        var0_1 = Cipher.getInstance(XU.C("3\\ZH&Iy{e\u0010s\r\u0002\tQ:I*\tn"));
        v0 = SecretKeyFactory.getInstance(v1.C("\u0007\u000bZ"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var7 >>> 56);
        v3 = var1_2 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var1_2++;
            v2[v4] = (byte)(var7 << v4 * 8 >>> 56);
            v3 = var1_2;
        }
        var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var6_3 = new String[4];
        var4_4 = 0;
        var3_5 = XU.C("I\u00eb\u00a0N\u00d6\u0083}\u00bb\u0083,\u00dd\u00e8\u009f\u00e8A\u00c4\f\u00cc.\u00f5\u00be\u000fQb\u00f7\u008e\bp\u00b7e\u00ff.\u00ec\u00c4\tj\u0010\u0017\u0000\u0090\u0082\u00cb\u0004\u0099\u00cf\u001a\u0018\u00e5(\u00c7\u0095`\u00df\u0004\u00ce\u0012\u00c8\u008f;{\u008dE\u00c0\u0005g\u00dex\u0090^\u00b0\u0096\u0002k@\n\"|\u00b9\u007fu60<jEch\u000e\u0093$\u00a9yUH3\u0000\u00e0M\u00be\u00d6\u00f5\u00e9;I\u0098(\u00a24+\u00b2\u009a\u00a3\u0098");
        var5_6 = var3_5.length();
        var2_7 = 72;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var3_5 = v1.C("\u00f9\u00e7\u00f1\u00ec^\u0001\u00c4eux\u00bfm\u00e2:\u0019\u009e\u0018\u008a.\u0082t\u007f_4\u00fe\u0098\u00cd\u008c\u00be\u0085/9k\u00db\u00c07&L\u00e8\u00c9dq\u00b8\u00e2\u0091\u00b6\u000bt\u00ff\u00e0\u00ca\u0019\u00aa\u00d1\u00cc\u00de\u00e5\u00c4\u00ef\u00b0\u00f3\u00b7Zn\u00ff\fAm\u0099#3\u0091\u00d9");
                var5_6 = var3_5.length();
                var2_7 = 40;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = P.a(var0_1.doFinal(v6.getBytes(XU.C("y\rxt\bf\u0018zJ8")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = P.a(var0_1.doFinal(v6.getBytes(XU.C("y\rxt\bf\u0018zJ8")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        P.c = var6_3;
                        P.e = new String[4];
                        P.K = (Logger)ye.a("G", (String)ye.a("j", P.class, (long)5371625388720572646L, (long)var7), (long)5423162591444663663L, (long)var7);
                        return;
                    }
                    var2_7 = var3_5.charAt(var1_2);
                }
            }
            break;
        }
    }

    @Override
    public /* synthetic */ boolean cancel(boolean bl) {
        return false;
    }
}

