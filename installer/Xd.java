/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.Key;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import net.futureclient.installer.N1;
import net.futureclient.installer.N8;
import net.futureclient.installer.NC;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Xd {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Path M;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Path I;
    private static final /* synthetic */ Map d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x525A;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u0014\u001aV#g,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(NC.C("$^6"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(\u0017W5!\u001ao"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NC.C("A%\u001b\u0007\u001ad+Y6T"));
            Xd.c[n2] = Xd.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ boolean f(Object[] this_) {
        Object object;
        block9: {
            long l2 = (Long)this_[0];
            l2 = a ^ l2;
            CallSite callSite = ye.a("G", (long)-3319674797956612979L, (long)l2);
            try {
                object = ye.a("G", (Object)((Path)((Object)ye.a("Z", (long)-3332907026976417300L, (long)l2))), (Object)new LinkOption[0], (long)-3405108841802046892L, (long)l2);
                if (callSite == null) return (boolean)object;
                if (object == false) break block9;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (Throwable)((Object)ye.a("G", (Object)runtimeException, (long)-3202062159078260221L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    try {
                        try {
                            throw (Throwable)((Object)ye.a("G", (Object)runtimeException2, (long)-3202062159078260221L, (long)l2));
                        }
                        catch (RuntimeException runtimeException3) {
                            throw (Throwable)((Object)ye.a("G", (Object)runtimeException3, (long)-3202062159078260221L, (long)l2));
                        }
                    }
                    catch (RuntimeException runtimeException4) {
                        throw (Throwable)((Object)ye.a("G", (Object)runtimeException4, (long)-3202062159078260221L, (long)l2));
                    }
                }
            }
            object = ye.a("G", (Object)((Path)((Object)ye.a("Z", (long)-3214825104592086623L, (long)l2))), (Object)new LinkOption[0], (long)-3405108841802046892L, (long)l2);
            if (callSite == null) return (boolean)object;
            if (object != false) {
                return true;
            }
        }
        object = false;
        return (boolean)object;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Xd.a(this222, l2);
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
    private static /* synthetic */ String V(Object[] this_) {
        Object object;
        Object object2;
        long l2;
        block14: {
            l2 = (Long)this_[0];
            object2 = (Path)this_[1];
            object = (String)this_[2];
            Object object3 = (String)this_[3];
            l2 = a ^ l2;
            object2 = (InputStream)((Object)ye.a("G", (Object)object2, (Object)new OpenOption[0], (long)-714230751664060167L, (long)l2));
            Throwable throwable = null;
            try {
                KeyStore keyStore = (KeyStore)((Object)ye.a("G", (String)((Object)Xd.a("d", (int)11813, (long)(0x44F53B2747628962L ^ l2))), (long)-814627876364919535L, (long)l2));
                ye.a("j", (Object)keyStore, null, (Object)ye.a("j", (Object)object3, (long)-604969247751531185L, (long)l2), (long)-709504295678294834L, (long)l2);
                KeyStore.PasswordProtection passwordProtection = new KeyStore.PasswordProtection((char[])ye.a("j", (Object)object3, (long)-604969247751531185L, (long)l2));
                ye.a("j", (Object)keyStore, (Object)object2, (Object)ye.a("j", (Object)object3, (long)-604969247751531185L, (long)l2), (long)-709504295678294834L, (long)l2);
                object3 = (SecretKeyFactory)((Object)ye.a("G", (String)((Object)Xd.a("d", (int)18077, (long)(0x2A5D1F16374861DEL ^ l2))), (long)-622295860931596253L, (long)l2));
                object = (KeyStore.SecretKeyEntry)((Object)ye.a("j", (Object)keyStore, (Object)object, (Object)passwordProtection, (long)-704177255826432586L, (long)l2));
                object = (PBEKeySpec)((Object)ye.a("j", (Object)object3, (Object)((SecretKey)((Object)ye.a("j", (Object)object, (long)-705160777700907950L, (long)l2))), PBEKeySpec.class, (long)-793460627309384526L, (long)l2));
                object = new String((char[])ye.a("j", (Object)object, (long)-823064348671125726L, (long)l2));
            }
            catch (Throwable throwable2) {
                try {
                    Throwable throwable5 = throwable2;
                    throwable = throwable2;
                    throw throwable5;
                }
                catch (Throwable throwable6) {
                    Throwable throwable3;
                    block12: {
                        block13: {
                            try {
                                if (object2 == null) break block12;
                                if (throwable == null) break block13;
                            }
                            catch (Throwable throwable4) {
                                throw (Throwable)((Object)ye.a("G", (Object)throwable4, (long)-837225173259409939L, (long)l2));
                            }
                            try {
                                ye.a("j", (Object)object2, (long)-599636414912680932L, (long)l2);
                                throwable3 = throwable6;
                                throw throwable3;
                            }
                            catch (Throwable throwable9) {
                                ye.a("j", (Object)throwable, (Object)throwable9, (long)-717150473984083590L, (long)l2);
                                throwable3 = throwable6;
                                throw throwable3;
                            }
                        }
                        ye.a("j", (Object)object2, (long)-599636414912680932L, (long)l2);
                    }
                    throwable3 = throwable6;
                    throw throwable3;
                }
            }
            try {
                if (object2 == null) return object;
                if (throwable == null) break block14;
            }
            catch (Throwable throwable5) {
                throw (Throwable)((Object)ye.a("G", (Object)throwable5, (long)-837225173259409939L, (long)l2));
            }
            try {
                ye.a("j", (Object)object2, (long)-599636414912680932L, (long)l2);
                return object;
            }
            catch (Throwable throwable3) {
                ye.a("j", (Object)throwable, (Object)throwable3, (long)-717150473984083590L, (long)l2);
                return object;
            }
        }
        ye.a("j", (Object)object2, (long)-599636414912680932L, (long)l2);
        return object;
    }

    public static /* synthetic */ N1 n(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x223F7DEFDC75L;
        Object[] arrobject = new Object[4];
        arrobject[3] = (String)((Object)Xd.a("d", (int)9342, (long)(0x6DC8C42EC39F1827L ^ l2)));
        arrobject[2] = (String)((Object)Xd.a("d", (int)29838, (long)(0x457F549BC352C8D5L ^ l2)));
        arrobject[1] = (Path)((Object)ye.a("Z", (long)7876248201370363165L, (long)l2));
        arrobject[0] = l3;
        Object[] arrobject2 = new Object[4];
        arrobject2[3] = (String)((Object)Xd.a("d", (int)19560, (long)(0x4C777E8B16CAF032L ^ l2)));
        arrobject2[2] = (String)((Object)Xd.a("d", (int)24571, (long)(0x4B1030704C9FE3A6L ^ l2)));
        arrobject2[1] = (Path)((Object)ye.a("Z", (long)8039920583184508240L, (long)l2));
        arrobject2[0] = l3;
        return new N1((String)((Object)ye.a("G", (Object)arrobject, (long)7851140054847700204L, (long)l2)), (String)((Object)ye.a("G", (Object)arrobject2, (long)7851140054847700204L, (long)l2)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        Xd.a = wu.a(-6216081783674446670L, 7256133281159362315L, MethodHandles.lookup().lookupClass()).a(143766203300388L);
        var7 = Xd.a ^ 11524562013043L;
        var9_1 = var7 ^ 39244134079912L;
        Xd.d = new HashMap<K, V>(13);
        var0_2 = Cipher.getInstance(NC.C("f\u0019MO\u0005zZHF#P>!:r\tj\u0019*]"));
        v0 = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
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
        var6_4 = new String[8];
        var4_5 = 0;
        var3_6 = NC.C("\u008c\u00ef\u00c5\u00e3tA\u00dd6\u00e9\u009amO\u009f\u00af\u00e8\u0001M\u009b\u00cc\u0081p\u00e4&8\u00d9\u000f\u00c1Q\u00c9V\u00db2y\u00d8\u00df\u00d3$\u00d4Y\u00a6\u000e\u008d+l5\u00e4\u008a\n\u00c7\u00e8\u0080\u009e)\u00e4\n\u008c\u00a9\u008f\u00bf\u0015\u0080\u0095\u00fe\u0087\u00a5L%\u0082\u00f6q\u000b\u009f\u0018s{v\u00fd\u00a6Y\u008d6\u00dfQ\u00f4\u00e1\u00cb\u00ed\u0011$\u0099\u00ab\u0086\u0001p\u009a\u00f7\u001b\u00e7\u001f>\u0015\u00c7\u00a1\u00f8(\u00b1\u00f91/\u0085#\u00c2;\u00fe\u000f\u001c\u00edk\u001d\u008d /\u000fG\u00f7\u00de\u00e6\u00bd\u00dchL\u0091\u0084h\u00c9\u00bf\u00e9^r\u00e5\u00c2<\u0095\u0094\u0010IM#\u00c4\u00b9\rK\u00b2)h\u00abvKj\u001d\u00ab\u00ceFw\u00b27\u00e8}\u00e7\u0099FM\u008b\u00f0=\u0007\u00f5\u00b5\u0014\u0086\u00e9%LT\u0007X\u001fo\u00b5l\u00d1v\u0005\u0015\u00dc\u0087\u008d.\u00d6\u001e\t\u00da!\u00fe\u00b1\\\u00ff\u00e6\u00803\u00f9\u0082\u0002\u00e8\u00b0\u0091\u00ab\u00d0\u00b5wJ\u0014\u00a8\u00a9\u00ff\u0096\u00a3\u00a9\u00d5\u00ff\u008a4\u009f\u00c8=\u00d7\u00f6M\u00cf\u00e5\u00bbz\u00c0~\u0006\bt\u00f5\u00df)wm\u009fH\u00b9\u00f85\u00a16$\u00a8\u00eer\u00fbb96\u009a\u00ed:\u0011a\u00af\"|x]pf\u00f0\f\u00e2\u0090\u0002\u00d6\u00e7_\u00ecP\u00ad\u007f\u00f5v`\u001b\u00f3\u00e4+\u0005\u00c3\u00cd\u00a6\u0096\u00e4\u00c6\u00f8\u00d2~\u0018\u0093\u0018\u000b\u00d9Y\u008b}N\u0084\u00d2\u0011\u000e\u008e\u00dc\u0019p\u00f4\u00d0#g7,\u00de*6/q\u0083]\u00f06w");
        var5_7 = var3_6.length();
        var2_8 = 104;
        var1_3 = -1;
        block4: while (true) {
            v5 = ++var1_3;
            v6 = var3_6.substring(v5, v5 + var2_8);
            v7 = -1;
            ** GOTO lbl76
            {
                var3_6 = N8.C("\u00e3\u001d\u00d0\f\u00d9i#\u0018\u00deX\u008d\u00d5\u00d1\u00c1\u0099\u00db\"\u00f6\u001e\u000e\u00076z\u0018\u008eT\u00cfb\u00fa\\\t\u00ac\u009d1E\r\u00e3\u00db\u008c\u00a0\u0096\u0002\u00bbZ@\u0018\u00c1\u00cc\u0004x\u00d8`w\u0000$0\u00a27#\u00c2\u0000zB\u00df$&xY\u008e\u00d9\u00d7\u00e9h\u00bc>>\u0088\u00c1\u0094\u000f\u00d1Wv\u00b5\u0098\u00a2c\u00f7f\u0003\u00f0\u00da',J\u0083x\u00cfp<\u00a8\u00e8\u00cf\u0097x\u00ed\u009c\u008e\u00809g\u00a8)\u007fA\u0001\u00baC\u00bd\u00a9\rJ#\u0018\u00c5bm\u0012\u0010\u0018\u0013'\u00ae\u00ec\u0006\u0003\u0082S\u00d2\u008a\u00da\u0083\"\u00af=\u00fb\u00a9\u00ed\"\u00ba|u\u00ef\u0017\u0002\u000e\u00b5\u00afaO\u0017\u0002$#X=S\u0019\u00d3E0r\u0012\u0085\u0089\u0088\u00a2\u0096\u00da\u000f\u00b0\u00e3\u00c8\u00f6\u00d0\u00d4\u00b7\u001a\u00ee]\u008b\u0088\u00ea\u0019T\u00c4<xq`\u00d7");
                var5_7 = var3_6.length();
                var2_8 = 104;
                var1_3 = -1;
                while (true) {
                    v8 = ++var1_3;
                    v6 = var3_6.substring(v8, v8 + var2_8);
                    v7 = 0;
lbl76:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_4[++var4_5] = Xd.a(var0_2.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                            if ((var1_3 += var2_8) >= var5_7) continue block5;
                            var2_8 = var3_6.charAt(var1_3);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_4[++var4_5] = Xd.a(var0_2.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                    if ((var1_3 += var2_8) >= var5_7) {
                        Xd.b = var6_4;
                        Xd.c = new String[8];
                        v9 = new Object[1];
                        v9[0] = var9_1;
                        Xd.M = (Path)ye.a("j", (Object)((Path)ye.a("G", (Object)v9, (long)-8219020381060855000L, (long)var7)), (Object)((String)Xd.a("d", (int)12906, (long)(9019437767234808875L ^ var7))), (long)-8181504883065098668L, (long)var7);
                        v10 = new Object[1];
                        v10[0] = var9_1;
                        Xd.I = (Path)ye.a("j", (Object)((Path)ye.a("G", (Object)v10, (long)-8219020381060855000L, (long)var7)), (Object)((String)Xd.a("d", (int)2253, (long)(5843715703605646989L ^ var7))), (long)-8181504883065098668L, (long)var7);
                        return;
                    }
                    var2_8 = var3_6.charAt(var1_3);
                }
            }
            break;
        }
    }

    public static /* synthetic */ void s(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        ye.a("G", (Object)((Path)((Object)ye.a("Z", (long)4922540805875715075L, (long)l2))), (long)5010210426460960338L, (long)l2);
        ye.a("G", (Object)((Path)((Object)ye.a("Z", (long)5083974530422754382L, (long)l2))), (long)5010210426460960338L, (long)l2);
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
}

