/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.DirectoryStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.Key;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.stream.Collector;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.EF;
import net.futureclient.installer.El;
import net.futureclient.installer.J;
import net.futureclient.installer.N4;
import net.futureclient.installer.Na;
import net.futureclient.installer.Nk;
import net.futureclient.installer.T5;
import net.futureclient.installer.TW;
import net.futureclient.installer.Tq;
import net.futureclient.installer.Ty;
import net.futureclient.installer.XG;
import net.futureclient.installer.XV;
import net.futureclient.installer.k;
import net.futureclient.installer.vR;
import net.futureclient.installer.vy;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class pV {
    private final /* synthetic */ Path u;
    public static final /* synthetic */ TW X;
    public static final /* synthetic */ TW q;
    public static final /* synthetic */ TW i;
    public final /* synthetic */ EF p;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ Map d;
    private final /* synthetic */ List V;
    public static final /* synthetic */ TW G;
    public static final /* synthetic */ TW n;
    private final /* synthetic */ T5 z;

    public static /* synthetic */ N4 s(Object[] this_) {
        long l2 = (Long)this_[0];
        pV pV2 = (pV)this_[1];
        String string = (String)this_[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0xEB59F5472A6L;
        pV pV3 = pV2;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = string;
        return (N4)((Object)ye.a("\u00aa", (Object)pV3, (Object)((Path)((Object)ye.a("j", (Object)pV3, (Object)arrobject, (long)2162945092569324617L, (long)l2))), (long)2280052995654818127L, (long)l2));
    }

    private /* synthetic */ Path S(Object[] object) {
        Object[] arrobject = object;
        object = (String)object[0];
        long l2 = (Long)arrobject[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x570A56268C21L;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = object;
        arrobject2[1] = l3;
        arrobject2[0] = (Path)((Object)ye.a("j", (Object)((Path)((Object)ye.a("\u00c3", (Object)this, (long)-2367724961015116889L, (long)l2))), (Object)object, (long)-2542198677729526631L, (long)l2));
        return (Path)((Object)ye.a("G", (Object)arrobject2, (long)-2524919378481156558L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        pV.a = wu.a(-2258699153288640812L, 1948659807729288229L, MethodHandles.lookup().lookupClass()).a(223778430835093L);
        var7 = pV.a ^ 81098410885150L;
        pV.d = new HashMap<K, V>(13);
        var0_1 = Cipher.getInstance(J.C("H&yj\u0003m\\_@4V)'-t\u001el\u000e,J"));
        v0 = SecretKeyFactory.getInstance(Na.C("\u0015M$"));
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
        var6_3 = new String[24];
        var4_4 = 0;
        var3_5 = J.C("\u0017\u0004\u00a9f\u0016\u00db\u0018b\u00ec\f\u000f>\u001b\u00c9W\u0099Q\u0018\u00dbL\u00b0\u00fb>\u0080\u00aa!>\u00c3\u00daM\u00f6\u009f\u00f8Pw\u008e\u00ed^\u001e\u0011w\u00a4\\\u009a\u00cf(&_&V\u0016\u008d5\u00f2\u00c6\u0097m\u0018\u00f3\u008cD\u0092IX\u00b9\u00c1jl\u00b9\u00e1\u00e3\u00e1nd\u00bb\u008d\u00eb<\u00f1\u0096\u00a8\u00e2\u00e4f'%\u00c7\u00eb\u00e3w\u00b1m\u00fe\u00f6\u00b5V\u0005\u00d7m\u00af\u00d7\u0015\u00a2\u008f\u0005_\u00bd\u00e1bPv|l\u00f1\u0082O\u0000\u00d9fr{\u0090\u00f2\u0082#\u00c6&('\u008bMk\u00eb\u0099\u0087\u009c3\u00b6\u0082\u00119\u00d9^q>De\r\u0088&\u00a7\u00b0q\u0084U\u0013\u0085\u0019\u00d9K\u00b7^\u00d3\u00e9\u00e7f\u00df\u0003\u00f2D]CDdK\u00fc'.\u0002m\u000bj\u00c1\u00ba\u009f\u007f\u0015\u00bb\u00d4'h{\u009d_\u00a1\u00b2\u0005\u00c6\u000b\u0004\u00ec\u00ca\u00d7.r\u00c7\u00ad\u0013\u00c6\u0090\u0007&\u00bc\u0099\u00fd\u00bfv\u00df\u00bcr\u00b4>\u00e7\u00d51\u00f3\u000f\u0004\u0088l\u00f1\u0094\u0013\u001e!\u0090C&\u0086\u00c5\u00b2\u00e3\u001fG0j\u008d\u00913\u00d4\u00b7m`\u0005i\u0089\u00ec+L\u00f3\u00a2?[\u009c\u00d77h*_E\u00eeC\u0096\u00e6\u00e9\u00cb|wm\u000e\u0097\u0018\u0011YAe\u0084\u008b\u000f\u00b1V\u00c4ejZ\u00a39\u00d8\u00e1Q\u0085B\u00aa\u00bb/\u009a\u00d89cz\u008f&X\u00d4\u00b6o\u00ab\u00da_\u008c2\u001d-aS\u00cd\u00de9\u00ee\u00a4\u00d6\u00ee\u0096NG\u00a0 \b({\u00921j\u001cB\u00f4\u00a2\u0093e\u0003\u00b6\n\u001e\u00be\r\u00018\u0007\u001e[N:hf\u008f\u00caj\u00a18\u0000\b\u00d4z\u00c2\u0089\u00ceG\u0015\u00ed\u00d66W\u009d\u00e1F\u00a0D]9\u00f2/T\u0011\u0006\u00f45\u0017\u00c8!\u0085r>\u00b4\u00ed\u00c955\u00ff4Zz\u00fc\u00b6\u0081\u00b9\u00aec\tv\u0001\u00a2\u00d9\u00d6\u00b5\u0005\u0002\u00ba\u001f\u00e7\u00a9:mG}j{|D\u008cg9\u0016\u00a0\u0092A\u00f6\u0094\u00f5\u00ea\u00d8n\n\u00c6\u00df$\u0011\u00f5\u00d2\u0085\u0017aM\u00b7\u00d1\u00f6b\u00e8\u001bB\u00c8\u00ac'\u001a\u00eb\u00c5\u0004\u00d4\u00aeQ\u0092\u00a4\u000e\u00c8Gx\u00be\u0095A\u00bc\u00fc\u00dc\u00b8\u00f6\u00f8\u00ef\u0007\u00f7K\u00ea\u0086\u001b}l\u008f:<#v\u00a7\u0093\u0014\u00e5\u00d1\u0095\u0088\u00cd$\u00f5m\u00d6V'\u00f0\u0092\u000f\u0002Wa\u00e9K\u00a8\u0091\u0013\u00cc(\u00990_\u0000\u00e8,1\u008a\u0096\u00e1\u00a5nCb\u008e-\u00f6|\u00d4f\u00a6\u0003\u00fe\u00bf\u00b6\u00ed\u00f9\u00af\u00a6|\u00ff7.;2q\u00d7C\u009e\u0010cqn\u00a5\u009e\u00c3\u001c\u00b1o\u00fd0\u00dfc\u0013\u00e8\u008a\u00df\u00a9\u00ec\u00c7\u00caN\u00d6\u00fa\re\u00ebX8\u0087\u00eb\u0091\u00a6E\u00d7(\u00a2\u00c5\u00b3\u0094\u001d\u00d9\t\u00b2\u00e31\u00e9\u00f9]#\u00d5\u00cc`\u00cc\u00e3\u0089\u0011\u00e8\u00d5\"\u00be\u00b44EY\u0001^WQ\u001f\u00bb|U\u001b\"\u00ebRF\u00faWa{\u00ce\u00cb\u009b\u00d1\u009f\u00bf\u00df\u00afQ\u00ac+\u00e44\u000eeK\u001e\u00de\u008a\u00cd_E\u00a0\u0088\u00d2\u00acv\u0095\u00f1\u00d7&j\u00a0\u00f7R\u0019r6\u00a2\u00db\u00e6\tI\u007f-v\u0090\u00b1q\u00aa[\u0097\u00a2f\u00cd\u0090wS\u001e\u007f\u00d8\u00cd\u0084\u00fbJ\u00dd\u00cd\b\u00d8h\u0001\u00b6\u00b6\u00b5W-\u00a1\u00d9\u00c3\u00de\u008b$\u00e8&\u00e1\u00d3\u00c5\u00a84\n7K\u0017\f\u00b6\u00c5\u0087\u00fe\u00ed\u00a1\u00f6\u00d5h\u00a3\u00a6\u00db~\u00cb\u00dc\u0090X\u0098\u00fe\u00ab\u00ca\u00d4\u00ce\u00b9\u0014\u0014\u0016S\u00be\u00c15\u00c2,\u0087[t=\u00d3\u00f2_\u00aa#\u00cbo\u00a5D\f\u00cd\u00e2\u0092|lq\u00f0\n\u00f6-Jj\u00adee");
        var5_6 = var3_5.length();
        var2_7 = 40;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var3_5 = Na.C("n\u00ad\u00af\u00b1`P\u001f\u00e1\u000f\u00c7\u001a\u00b4k\u00ea|\u00c7\u00c6\u0096\u0084\u00b5 \u00d6)@\u00e2\u00ce\u0010\u00a9P.S\u00ea\u0094t\u00e1\u0012\u00d6\u00c7\u00b3C\u00e9\u00be\u00d71\u00f1\b\u001aD{\u001f\u00ffm6\u00f4\u00a1R\u00e3~[\u0018\u00c2\u009c\u0092l\u00b9\u00aa\u0099\u00f5[\u00bdU\u00b7\u00fea\u00adNo\u0011\u00a1\u00f2\u00b2B\u0088\u0000\u0098\u008e\u001c\u0083\u0004");
                var5_6 = var3_5.length();
                var2_7 = 48;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = pV.a(var0_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = pV.a(var0_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        pV.b = var6_3;
                        pV.c = new String[24];
                        pV.q = new TW((String)pV.a("g", (int)6759, (long)(6671945537539585276L ^ var7)), (String)pV.a("g", (int)25198, (long)(6159501803546266856L ^ var7)), (String)pV.a("g", (int)10791, (long)(1777780523684201642L ^ var7)));
                        pV.i = new TW((String)pV.a("g", (int)18969, (long)(8704018325084300434L ^ var7)), (String)pV.a("g", (int)16318, (long)(5482932332617896244L ^ var7)), (String)pV.a("g", (int)25891, (long)(4185811141716364196L ^ var7)));
                        pV.n = new TW((String)pV.a("g", (int)17238, (long)(2541386524031282634L ^ var7)), (String)pV.a("g", (int)20352, (long)(2026495823873368329L ^ var7)), (String)pV.a("g", (int)26164, (long)(116252645955553463L ^ var7)));
                        pV.G = new TW((String)pV.a("g", (int)17807, (long)(5419695165041896205L ^ var7)), (String)pV.a("g", (int)16337, (long)(2770999270648287581L ^ var7)), (String)pV.a("g", (int)11189, (long)(8265448928880133429L ^ var7)));
                        pV.X = new TW((String)pV.a("g", (int)25455, (long)(4460416052617858539L ^ var7)), (String)pV.a("g", (int)2503, (long)(8830673513171658562L ^ var7)), (String)pV.a("g", (int)2853, (long)(4667119272498865597L ^ var7)));
                        return;
                    }
                    var2_7 = var3_5.charAt(var1_2);
                }
            }
            break;
        }
    }

    public final /* synthetic */ List e(Object[] arrobject2) {
        int n2 = (Integer)arrobject2[0];
        int n3 = (Integer)arrobject2[1];
        String string = (String)arrobject2[2];
        int arrobject2 = (Integer)arrobject2[3];
        long l2 = ((long)n2 << 48 | (long)n3 << 32 >>> 16 | (long)arrobject2 << 48 >>> 48) ^ a;
        return (List)((Object)ye.a("j", (Object)((Stream)((Object)ye.a("j", (Object)((Stream)((Object)ye.a("j", (Object)((List)((Object)ye.a("\u00c3", (Object)this, (long)5308301750737668937L, (long)l2))), (long)5383266038509356893L, (long)l2))), object -> {
            long l2 = a ^ 0x39814FC404C7L;
            long l3 = l2 ^ 0x4DE8DCAF89FL;
            CallSite callSite = ye.a("G", (long)-5272304519520920650L, (long)l2);
            Object[] arrobject = new Object[2];
            arrobject[1] = object;
            arrobject[0] = l3;
            Object object2 = object = (String)((Object)ye.a("G", (Object)arrobject, (long)-5265052842280273477L, (long)l2));
            try {
                if (callSite != null) {
                    if (object2 == null) return false;
                    object2 = object;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw (Throwable)((Object)ye.a("G", (Object)illegalArgumentException, (long)-5189000071100140269L, (long)l2));
            }
            try {
                Object object3 = ye.a("j", (Object)object2, (Object)string, (long)-5459511214053339592L, (long)l2);
                if (callSite == null) return object3;
                if (!object3) return false;
                return true;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                try {
                    throw (Throwable)((Object)ye.a("G", (Object)illegalArgumentException, (long)-5189000071100140269L, (long)l2));
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    throw (Throwable)((Object)ye.a("G", (Object)illegalArgumentException2, (long)-5189000071100140269L, (long)l2));
                }
            }
        }, (long)5311935081951412074L, (long)l2))), (Object)((Collector)((Object)ye.a("G", (long)5348474889203476034L, (long)l2))), (long)5422600874388672470L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ String i(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ N4 y(Object[] object2222222) {
        Object object2222222;
        N4 n4;
        long l2;
        block14: {
            Object object = object2222222;
            l2 = (Long)object[0];
            object2222222 = (Path)object[1];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x68216B4660DFL;
            int n2 = (int)(l3 >>> 48);
            int n3 = (int)(l3 << 16 >>> 32);
            int n5 = (int)(l3 << 48 >>> 48);
            object2222222 = (BufferedReader)((Object)ye.a("G", (Object)object2222222, (long)-7341171082362964974L, (long)l2));
            Throwable throwable = null;
            try {
                Object[] arrobject = new Object[5];
                arrobject[4] = (int)((short)n5);
                arrobject[3] = N4.class;
                arrobject[2] = n3;
                arrobject[1] = (int)((short)n2);
                arrobject[0] = object2222222;
                n4 = (N4)((Object)ye.a("j", (Object)((EF)((Object)ye.a("\u00c3", (Object)this, (long)-7357590726794961577L, (long)l2))), (Object)arrobject, (long)-7366520644469917444L, (long)l2));
            }
            catch (Throwable throwable2) {
                try {
                    Throwable throwable4 = throwable2;
                    throwable = throwable2;
                    throw throwable4;
                }
                catch (Throwable throwable5) {
                    Throwable throwable3;
                    block12: {
                        block13: {
                            try {
                                if (object2222222 == null) break block12;
                                if (throwable == null) break block13;
                            }
                            catch (Throwable throwable4) {
                                throw (Throwable)((Object)ye.a("G", (Object)throwable4, (long)-7346305758359824157L, (long)l2));
                            }
                            try {
                                ye.a("j", (Object)object2222222, (long)-7260451947842350694L, (long)l2);
                                throwable3 = throwable5;
                                throw throwable3;
                            }
                            catch (Throwable object2222222) {
                                ye.a("j", (Object)throwable, (Object)object2222222, (long)-7266206539395525537L, (long)l2);
                                throwable3 = throwable5;
                                throw throwable3;
                            }
                        }
                        ye.a("j", (Object)object2222222, (long)-7260451947842350694L, (long)l2);
                    }
                    throwable3 = throwable5;
                    throw throwable3;
                }
            }
            try {
                if (object2222222 == null) return n4;
                if (throwable == null) break block14;
            }
            catch (Throwable throwable5) {
                throw (Throwable)((Object)ye.a("G", (Object)throwable5, (long)-7346305758359824157L, (long)l2));
            }
            try {
                ye.a("j", (Object)object2222222, (long)-7260451947842350694L, (long)l2);
                return n4;
            }
            catch (Throwable object2222222) {
                ye.a("j", (Object)throwable, (Object)object2222222, (long)-7266206539395525537L, (long)l2);
                return n4;
            }
        }
        ye.a("j", (Object)object2222222, (long)-7260451947842350694L, (long)l2);
        return n4;
    }

    public static /* synthetic */ Path e(Object[] this_) {
        Path path = (Path)this_[0];
        long l2 = (Long)this_[1];
        String string = (String)this_[2];
        l2 = a ^ l2;
        return (Path)((Object)ye.a("j", (Object)path, (Object)((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)string, (long)-2129404587052916027L, (long)l2))), (Object)((String)((Object)pV.a("g", (int)8499, (long)(0x44136FFD821B5D46L ^ l2)))), (long)-2129404587052916027L, (long)l2))), (long)-2189380094756584150L, (long)l2))), (long)-2192362958720171598L, (long)l2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x1F98;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Na.C("i\u0017yz|\u0002qbb\u0006x\u0017\u0019\u0003\u0011kJ8f\u0010"));
                    arrobject[1] = SecretKeyFactory.getInstance(J.C("\u0001X!"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Na.C("!O!_iB<E=H1F<Z.Fb[#H0M?\u001cj\\~x!"), exception);
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
            byte[] arrby2 = b[n2].getBytes(J.C("G2\u001d\u00104[\u001f|0C"));
            pV.c[n2] = pV.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ boolean n(Path this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[CATCHBLOCK]
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

    private static /* synthetic */ boolean y(Path this_) {
        long l2 = a ^ 0x2DACD1109F72L;
        return (boolean)ye.a("G", (Object)this_, (Object)new LinkOption[0], (long)3182300062643611838L, (long)l2);
    }

    public static /* synthetic */ EF T(Object[] this_) {
        pV pV2 = (pV)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        return (EF)((Object)ye.a("\u00c3", (Object)pV2, (long)-7550406849035136124L, (long)l2));
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
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public /* synthetic */ pV(long this, Path this) {
        block85: {
            block86: {
                block83: {
                    block84: {
                        block81: {
                            block82: {
                                block76: {
                                    block77: {
                                        block79: {
                                            block80: {
                                                block78: {
                                                    block72: {
                                                        block74: {
                                                            block75: {
                                                                block73: {
                                                                    block70: {
                                                                        block71: {
                                                                            block68: {
                                                                                block69: {
                                                                                    block66: {
                                                                                        block67: {
                                                                                            block64: {
                                                                                                block89: {
                                                                                                    block63: {
                                                                                                        block65: {
                                                                                                            block62: {
                                                                                                                block61: {
                                                                                                                    block60: {
                                                                                                                        this = pV.a ^ this;
                                                                                                                        var4_5 = this ^ 117570688090034L;
                                                                                                                        var6_6 = this ^ 43189542308100L;
                                                                                                                        var8_9 = this ^ 12436517069646L;
                                                                                                                        var10_10 = this ^ 7946042362274L;
                                                                                                                        var12_11 = this ^ 121360079670725L;
                                                                                                                        var14_12 = this ^ 116818528081084L;
                                                                                                                        var16_13 = this ^ 19922291102443L;
                                                                                                                        v0 = ye.a("G", (long)3437387631866168023L, (long)this);
                                                                                                                        super();
                                                                                                                        var18_14 = v0;
                                                                                                                        v1 = this;
                                                                                                                        var19_15 = new XV();
                                                                                                                        new XV().C = true;
                                                                                                                        v2 = new Object[3];
                                                                                                                        v2[2] = new XG(this, 0);
                                                                                                                        v2[1] = var6_6;
                                                                                                                        v2[0] = N4.class;
                                                                                                                        v3 = new Object[3];
                                                                                                                        v3[2] = new Ty(0);
                                                                                                                        v3[1] = var6_6;
                                                                                                                        v3[0] = vy.class;
                                                                                                                        var19_15 = (XV)ye.a("j", (Object)((XV)ye.a("j", (Object)var19_15, (Object)v2, (long)3373096178914409626L, (long)this)), (Object)v3, (long)3373096178914409626L, (long)this);
                                                                                                                        var20_16 = new ArrayList<E>((int)(ye.a("j", (Object)var19_15.A, (long)3324779175275088633L, (long)this) + ye.a("j", (Object)var19_15.J, (long)3324779175275088633L, (long)this) + 3));
                                                                                                                        ye.a("j", var20_16, (Object)var19_15.A, (long)3304065299598129450L, (long)this);
                                                                                                                        ye.a("G", var20_16, (long)3260593193928783386L, (long)this);
                                                                                                                        var21_22 = new ArrayList<E>(var19_15.J);
                                                                                                                        ye.a("G", var21_22, (long)3260593193928783386L, (long)this);
                                                                                                                        ye.a("j", var20_16, var21_22, (long)3304065299598129450L, (long)this);
                                                                                                                        v4 = var19_15;
                                                                                                                        var6_7 = var20_16;
                                                                                                                        var23_23 = var19_15.l;
                                                                                                                        var22_24 = v4.n;
                                                                                                                        v5 = var21_22 = v4.q;
                                                                                                                        try {
                                                                                                                            if (var18_14 == null) break block60;
                                                                                                                            if (v5 == null) break block61;
                                                                                                                        }
                                                                                                                        catch (Throwable v6) {
                                                                                                                            throw (Throwable)ye.a("G", (Object)v6, (long)3359114411215809650L, (long)this);
                                                                                                                        }
                                                                                                                        v5 = "";
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v7 /* !! */  = (int)ye.a("j", (Object)v5, (Object)((String)ye.a("j", (Object)var21_22, (long)3432086476590654471L, (long)this)), (long)3268175537660909401L, (long)this);
                                                                                                                        if (this < 0L || var18_14 == null) break block62;
                                                                                                                        if (v7 /* !! */  != 0) break block61;
                                                                                                                    }
                                                                                                                    catch (Throwable v8) {
                                                                                                                        throw (Throwable)ye.a("G", (Object)v8, (long)3359114411215809650L, (long)this);
                                                                                                                    }
                                                                                                                    var24_26 = new vR(java.util.Date.class, (String)var21_22, var8_9);
                                                                                                                    var25_27 = new vR(Timestamp.class, (String)var21_22, var8_9);
                                                                                                                    var21_22 = new vR(Date.class, (String)var21_22, var8_9);
                                                                                                                    v9 = var6_7;
                                                                                                                    break block89;
                                                                                                                }
                                                                                                                v7 /* !! */  = var22_24;
                                                                                                            }
                                                                                                            v10 /* !! */  = 2;
                                                                                                            if (var18_14 == null) break block63;
                                                                                                            if (v7 /* !! */  == v10 /* !! */ ) break block64;
                                                                                                            v7 /* !! */  = var23_23;
                                                                                                            break block65;
                                                                                                            catch (Throwable v11) {
                                                                                                                throw (Throwable)ye.a("G", (Object)v11, (long)3359114411215809650L, (long)this);
                                                                                                            }
                                                                                                        }
                                                                                                        v10 /* !! */  = 2;
                                                                                                        {
                                                                                                            catch (Throwable v12) {
                                                                                                                throw (Throwable)ye.a("G", (Object)v12, (long)3359114411215809650L, (long)this);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (v7 /* !! */  == v10 /* !! */ ) break block64;
                                                                                                    var24_26 = new vR(java.util.Date.class, var22_24, var23_23, var16_13);
                                                                                                    var25_27 = new vR(Timestamp.class, var22_24, var23_23, var16_13);
                                                                                                    var21_22 = new vR(Date.class, var22_24, var23_23, var16_13);
                                                                                                    v9 = var6_7;
                                                                                                }
                                                                                                v13 = new Object[2];
                                                                                                v13[1] = var24_26;
                                                                                                v13[0] = java.util.Date.class;
                                                                                                ye.a("j", v9, (Object)((Nk)ye.a("G", (Object)v13, (long)3445922033336403757L, (long)this)), (long)3344888859834246154L, (long)this);
                                                                                                v14 = new Object[2];
                                                                                                v14[1] = var25_27;
                                                                                                v14[0] = Timestamp.class;
                                                                                                ye.a("j", var6_7, (Object)((Nk)ye.a("G", (Object)v14, (long)3445922033336403757L, (long)this)), (long)3344888859834246154L, (long)this);
                                                                                                v15 = new Object[2];
                                                                                                v15[1] = var21_22;
                                                                                                v15[0] = Date.class;
                                                                                                ye.a("j", var6_7, (Object)((Nk)ye.a("G", (Object)v15, (long)3445922033336403757L, (long)this)), (long)3344888859834246154L, (long)this);
                                                                                            }
                                                                                            v16 = var19_15;
                                                                                            v17 = var19_15;
                                                                                            v1.p = new EF(var10_10, var19_15.x, v16.h, v16.X, v17.s, v17.C, var19_15.m, var20_16);
                                                                                            var20_17 = (TimeUnit)ye.a("Z", (long)3430840036046602119L, (long)this);
                                                                                            var19_15 = (Tq)ye.a("G", (Object)new Object[0], (long)3364862964776321462L, (long)this);
                                                                                            try {
                                                                                                cfr_temp_0 = var19_15.l - -1L;
                                                                                                v18 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                if (var18_14 == null) break block66;
                                                                                                if (v18 != false) break block67;
                                                                                            }
                                                                                            catch (Throwable v19) {
                                                                                                throw (Throwable)ye.a("G", (Object)v19, (long)3359114411215809650L, (long)this);
                                                                                            }
                                                                                            v18 = 1;
                                                                                            break block66;
                                                                                        }
                                                                                        v18 = 0;
                                                                                    }
                                                                                    var6_8 = var19_15.l;
                                                                                    var21_22 = (String)pV.a("g", (int)1387, (long)(8203192292551734858L ^ this));
                                                                                    v20 = var18_14;
                                                                                    if (this <= 0L) ** GOTO lbl232
                                                                                    if (v20 == null) break block68;
                                                                                    try {
                                                                                        block90: {
                                                                                            if (v18 != false) break block69;
                                                                                            break block90;
                                                                                            catch (Throwable v21) {
                                                                                                throw (Throwable)ye.a("G", (Object)v21, (long)3359114411215809650L, (long)this);
                                                                                            }
                                                                                        }
                                                                                        v22 = new Object[1];
                                                                                        v22[0] = (Long)ye.a("G", (long)var6_8, (long)3342622917734894646L, (long)this);
                                                                                        v23 = new Object[3];
                                                                                        v23[2] = v22;
                                                                                        v23[1] = var21_22;
                                                                                        v23[0] = var4_5;
                                                                                        throw new IllegalStateException((String)ye.a("G", (Object)v23, (long)3438062136699437462L, (long)this));
                                                                                    }
                                                                                    catch (Throwable v24) {
                                                                                        throw (Throwable)ye.a("G", (Object)v24, (long)3359114411215809650L, (long)this);
                                                                                    }
                                                                                }
                                                                                cfr_temp_1 = 15L - 0L;
                                                                                v18 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                            }
                                                                            try {
                                                                                v20 = var18_14;
lbl232:
                                                                                // 2 sources

                                                                                if (v20 == null) break block70;
                                                                                if (v18 < 0) break block71;
                                                                            }
                                                                            catch (Throwable v25) {
                                                                                throw (Throwable)ye.a("G", (Object)v25, (long)3359114411215809650L, (long)this);
                                                                            }
                                                                            v18 = 1;
                                                                            break block70;
                                                                        }
                                                                        v18 = 0;
                                                                    }
                                                                    var22_25 = var20_17;
                                                                    var21_22 = (String)pV.a("g", (int)2783, (long)(7075103073882028520L ^ this));
                                                                    try {
                                                                        if (v18 == false) {
                                                                            v26 = new Object[2];
                                                                            v26[0] = (Long)ye.a("G", (long)15L, (long)3342622917734894646L, (long)this);
                                                                            v26[1] = var22_25;
                                                                            v27 = new Object[3];
                                                                            v27[2] = v26;
                                                                            v27[1] = var21_22;
                                                                            v27[0] = var4_5;
                                                                            throw new IllegalArgumentException((String)ye.a("G", (Object)v27, (long)3438062136699437462L, (long)this));
                                                                        }
                                                                    }
                                                                    catch (Throwable v28) {
                                                                        throw (Throwable)ye.a("G", (Object)v28, (long)3359114411215809650L, (long)this);
                                                                    }
                                                                    var19_15.l = (long)ye.a("j", (Object)var20_17, (long)15L, (long)3449822631595211866L, (long)this);
                                                                    v29 = var20_18 = var19_15;
                                                                    if (this < 0L || var18_14 == null) break block72;
                                                                    if (v29.z == null) {
                                                                        v30 = var20_18;
                                                                        break block73;
                                                                    }
                                                                    ** GOTO lbl335
                                                                    catch (Throwable v31) {
                                                                        throw (Throwable)ye.a("G", (Object)v31, (long)3359114411215809650L, (long)this);
                                                                    }
                                                                }
                                                                try {
                                                                    block91: {
                                                                        cfr_temp_2 = v30.f - -1L;
                                                                        v32 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                                        if (var18_14 == null) break block74;
                                                                        break block91;
                                                                        {
                                                                            catch (Throwable v33) {
                                                                                throw (Throwable)ye.a("G", (Object)v33, (long)3359114411215809650L, (long)this);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v32 != false) break block75;
                                                                }
                                                                catch (Throwable v34) {
                                                                    throw (Throwable)ye.a("G", (Object)v34, (long)3359114411215809650L, (long)this);
                                                                }
                                                                v32 = 1;
                                                                break block74;
                                                            }
                                                            v32 = 0;
                                                        }
                                                        try {
                                                            v35 = new Object[3];
                                                            v35[2] = var14_12;
                                                            v35[1] = (String)pV.a("g", (int)26602, (long)(2579942806743667930L ^ this));
                                                            v35[0] = (boolean)v32;
                                                            ye.a("G", (Object)v35, (long)3355856018000786843L, (long)this);
                                                            if (var18_14 != null) break block76;
lbl335:
                                                            // 2 sources

                                                            v29 = var20_18;
                                                        }
                                                        catch (Throwable v36) {
                                                            throw (Throwable)ye.a("G", (Object)v36, (long)3359114411215809650L, (long)this);
                                                        }
                                                    }
                                                    v37 = v29.c;
                                                    v38 = var18_14;
                                                    if (this < 0L) ** GOTO lbl402
                                                    if (v38 == null) break block77;
                                                    if (v37) {
                                                        v39 = var20_18;
                                                        break block78;
                                                    }
                                                    ** GOTO lbl395
                                                    catch (Throwable v40) {
                                                        throw (Throwable)ye.a("G", (Object)v40, (long)3359114411215809650L, (long)this);
                                                    }
                                                }
                                                try {
                                                    block92: {
                                                        cfr_temp_3 = v39.f - -1L;
                                                        v37 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                        if (var18_14 == null) break block79;
                                                        break block92;
                                                        {
                                                            catch (Throwable v41) {
                                                                throw (Throwable)ye.a("G", (Object)v41, (long)3359114411215809650L, (long)this);
                                                            }
                                                        }
                                                    }
                                                    if (!v37) break block80;
                                                }
                                                catch (Throwable v42) {
                                                    throw (Throwable)ye.a("G", (Object)v42, (long)3359114411215809650L, (long)this);
                                                }
                                                v37 = true;
                                                break block79;
                                            }
                                            v37 = false;
                                        }
                                        try {
                                            if (this < 0L) break block77;
                                            v43 = new Object[3];
                                            v43[2] = var14_12;
                                            v43[1] = (String)pV.a("g", (int)16306, (long)(4844579177578400912L ^ this));
                                            v43[0] = v37;
                                            ye.a("G", (Object)v43, (long)3355856018000786843L, (long)this);
                                            if (var18_14 != null) break block76;
lbl395:
                                            // 2 sources

                                            v37 = (cfr_temp_4 = var20_18.f - -1L) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                                        }
                                        catch (Throwable v44) {
                                            throw (Throwable)ye.a("G", (Object)v44, (long)3359114411215809650L, (long)this);
                                        }
                                    }
                                    v38 = var18_14;
lbl402:
                                    // 2 sources

                                    if (this <= 0L) ** GOTO lbl422
                                    if (v38 == null) break block81;
                                    try {
                                        block93: {
                                            if (v37) break block76;
                                            break block93;
                                            catch (Throwable v45) {
                                                throw (Throwable)ye.a("G", (Object)v45, (long)3359114411215809650L, (long)this);
                                            }
                                        }
                                        ye.a("j", (Object)Tq.P, (Object)((Level)ye.a("Z", (long)3268273473569694131L, (long)this)), (Object)((String)pV.a("g", (int)31043, (long)(6603814824975977077L ^ this))), (long)3398032645421818518L, (long)this);
                                        v46 = var19_15;
                                        break block82;
                                    }
                                    catch (Throwable v47) {
                                        throw (Throwable)ye.a("G", (Object)v47, (long)3359114411215809650L, (long)this);
                                    }
                                }
                                v46 = var19_15;
                            }
                            v37 = (cfr_temp_5 = v46.r - -1L) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                        }
                        try {
                            v38 = var18_14;
lbl422:
                            // 2 sources

                            if (v38 == null) break block83;
                            if (v37) break block84;
                        }
                        catch (Throwable v48) {
                            throw (Throwable)ye.a("G", (Object)v48, (long)3359114411215809650L, (long)this);
                        }
                        v37 = true;
                        break block83;
                    }
                    v37 = false;
                }
                v49 = new Object[3];
                v49[2] = var14_12;
                v49[1] = (String)pV.a("g", (int)7895, (long)(4306909356573634032L ^ this));
                v49[0] = v37;
                ye.a("G", (Object)v49, (long)3355856018000786843L, (long)this);
                this.z = new El(var12_11, (Tq)var19_15);
                this.u = this /* !! */ ;
                this = (DirectoryStream)ye.a("G", (Object)this.u, (long)3360691682360248322L, (long)this);
                var19_15 = null;
                this.V = (List)ye.a("j", (Object)((Stream)ye.a("j", (Object)((Stream)ye.a("j", (Object)((Stream)ye.a("j", (Object)((Stream)ye.a("j", (Object)((Stream)ye.a("j", (Object)((Stream)ye.a("G", (Object)((Spliterator)ye.a("j", (Object)this, (long)3441358258725579966L, (long)this)), (boolean)false, (long)3399635596338156371L, (long)this)), (Predicate<Path>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, y(java.nio.file.Path ), (Ljava/nio/file/Path;)Z)(), (long)3277414709935954854L, (long)this)), (Function<Path, Path>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, B(java.nio.file.Path ), (Ljava/nio/file/Path;)Ljava/nio/file/Path;)(), (long)3331228060485579925L, (long)this)), (Predicate<Path>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, n(java.nio.file.Path ), (Ljava/nio/file/Path;)Z)(), (long)3277414709935954854L, (long)this)), (Function<Path, N4>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, t(java.nio.file.Path ), (Ljava/nio/file/Path;)Lnet/futureclient/installer/N4;)((pV)this), (long)3331228060485579925L, (long)this)), (Predicate<N4>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Lnet/futureclient/installer/N4;)Z)(), (long)3277414709935954854L, (long)this)), (Object)((Collector)ye.a("G", (long)3383863665523982990L, (long)this)), (long)3426268738080582426L, (long)this);
                if (this == null) break block85;
                if (var19_15 == null) break block86;
                try {
                    ye.a("j", (Object)this, (long)3357682761104019002L, (long)this);
                    return;
                }
                catch (Throwable var20_19) {
                    ye.a("j", (Object)var19_15, (Object)var20_19, (long)3438615624867258574L, (long)this);
                    return;
                }
            }
            ye.a("j", (Object)this, (long)3357682761104019002L, (long)this);
            return;
            catch (Throwable v50) {
                try {
                    var20_20 = v50;
                    var19_15 = v50;
                    throw var20_20;
                }
                catch (Throwable var20_21) {
                    block94: {
                        block87: {
                            block88: {
                                try {
                                    if (this == null) break block87;
                                    if (var19_15 == null) break block88;
                                }
                                catch (Throwable v51) {
                                    throw (Throwable)ye.a("G", (Object)v51, (long)3359114411215809650L, (long)this);
                                }
                                try {
                                    ye.a("j", (Object)this, (long)3357682761104019002L, (long)this);
                                    v52 = var20_21;
                                }
                                catch (Throwable this) {
                                    ye.a("j", (Object)var19_15, (Object)this, (long)3438615624867258574L, (long)this);
                                    v52 = var20_21;
                                }
                                break block94;
                            }
                            ye.a("j", (Object)this, (long)3357682761104019002L, (long)this);
                        }
                        v52 = var20_21;
                    }
                    throw v52;
                }
            }
        }
    }

    public final /* synthetic */ Path H(Object[] object) {
        Object[] arrobject = object;
        object = (N4)object[0];
        long l2 = (Long)arrobject[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x7F87E16511D5L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = (String)((Object)ye.a("\u00c3", (Object)object, (long)8995988192496266064L, (long)l2));
        return (Path)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)9040732333932920634L, (long)l2));
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    private /* synthetic */ N4 t(Path path) {
        long l2 = a ^ 0x7AF2E49C2FF5L;
        long l3 = l2 ^ 0x6F74F9C55937L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (N4)((Object)ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("j", (Object)((T5)((Object)ye.a("\u00c3", (Object)this, (long)-7077296328573901768L, (long)l2))), (Object)arrobject, (long)-7170641850590836484L, (long)l2))), (Object)((Path)((Object)ye.a("j", (Object)path, (long)-7190381425004042179L, (long)l2))).toString(), string2 -> {
            CallSite callSite;
            long l2;
            long l3;
            block11: {
                Path path2;
                l3 = a ^ 0x4DDB7C82B291L;
                l2 = l3 ^ 0x1B2C8DC32AACL;
                CallSite callSite2 = ye.a("G", (long)37003664887541216L, (long)l3);
                try {
                    callSite = ye.a("G", (Object)path, (Object)new LinkOption[0], (long)131673611271418681L, (long)l3);
                    if (callSite2 == null) break block11;
                    if (callSite == false) return null;
                    path2 = path;
                }
                catch (k k2) {
                    try {
                        throw (Throwable)((Object)ye.a("G", (Object)k2, (long)120053165132333893L, (long)l3));
                    }
                    catch (k k3) {
                        throw (Throwable)((Object)ye.a("G", (Object)k3, (long)120053165132333893L, (long)l3));
                    }
                }
                {
                    callSite = ye.a("G", (Object)path2, (Object)new LinkOption[0], (long)94873954751990225L, (long)l3);
                }
            }
            try {
                if (callSite == false) return null;
                try {
                    Object[] arrobject = new Object[2];
                    arrobject[1] = path;
                    arrobject[0] = l2;
                    return (N4)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)136328135346136368L, (long)l3));
                }
                catch (IllegalArgumentException | k string2) {
                    Object[] arrobject = new Object[1];
                    arrobject[0] = path;
                    ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)199455513940417482L, (long)l3))), (Object)((String)((Object)ye.a("G", (String)((Object)pV.a("g", (int)1199, (long)(0x624678C6E53B98A1L ^ l3))), (Object)arrobject, (long)108366945177942498L, (long)l3))), (long)207491621004616168L, (long)l3);
                    ye.a("j", (Object)string2, (long)42912879579454241L, (long)l3);
                    return null;
                }
                catch (IOException iOException) {
                    ye.a("j", (Object)iOException, (long)156147223346962362L, (long)l3);
                    return null;
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)120053165132333893L, (long)l3));
            }
        }, (long)-7184251809304516774L, (long)l2));
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = pV.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    private static /* synthetic */ Path B(Path this_) {
        long l2 = a ^ 0x71D74B3C385BL;
        String string = ((Path)((Object)ye.a("j", (Object)this_, (long)-8387288543154828066L, (long)l2))).toString();
        return (Path)((Object)ye.a("j", (Object)this_, (Object)((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)string, (long)-8584808925167040405L, (long)l2))), (Object)((String)((Object)pV.a("g", (int)31716, (long)(0xA94C27B7DEA6D3CL ^ l2)))), (long)-8584808925167040405L, (long)l2))), (long)-8416182701522522236L, (long)l2))), (long)-8413465681142617316L, (long)l2));
    }
}

