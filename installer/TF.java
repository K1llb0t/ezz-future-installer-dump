/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.TW;
import net.futureclient.installer.Tb;
import net.futureclient.installer.pe;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class TF {
    private static final /* synthetic */ Base64.Decoder S;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ Base64.Encoder t;
    private static final /* synthetic */ Tb V;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void main(String[] this_2) {
        String string;
        String string2;
        long l2;
        long l3;
        block7: {
            String string3;
            block8: {
                l3 = a ^ 0x7F418EDDB0AAL;
                l2 = l3 ^ 0xC0DF7A30844L;
                CallSite callSite = ye.a("G", (long)-265040414246006479L, (long)l3);
                try {
                    if (this_2.length != 3) {
                        ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (int)-1, (long)-197716980531076843L, (long)l3);
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw (Exception)((Object)ye.a("G", (Object)runtimeException, (long)-261805940177957112L, (long)l3));
                }
                string3 = new String((byte[])ye.a("j", (Object)((Base64.Decoder)((Object)ye.a("Z", (long)-280624647297346115L, (long)l3))), (Object)this_2[0], (long)-147393222610276574L, (long)l3), (Charset)((Object)ye.a("Z", (long)-275752752481984886L, (long)l3)));
                string2 = new String((byte[])ye.a("j", (Object)((Base64.Decoder)((Object)ye.a("Z", (long)-280624647297346115L, (long)l3))), (Object)this_2[1], (long)-147393222610276574L, (long)l3), (Charset)((Object)ye.a("Z", (long)-275752752481984886L, (long)l3)));
                CallSite this_2 = ye.a("G", new String((byte[])ye.a("j", (Object)((Base64.Decoder)((Object)ye.a("Z", (long)-280624647297346115L, (long)l3))), (Object)this_2[2], (long)-147393222610276574L, (long)l3), (Charset)((Object)ye.a("Z", (long)-275752752481984886L, (long)l3))), (long)-215026772893662234L, (long)l3);
                try {
                    string = (String)((Object)ye.a("G", (String)((Object)TF.a("n", (int)9115, (long)(0xE4DD3BF2C23F702L ^ l3))), (long)-274976541476279513L, (long)l3));
                    if (callSite == null) break block7;
                    if (ye.a("G", string, (long)-85193793798129978L, (long)l3) == false) break block8;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        throw (Exception)((Object)ye.a("G", (Object)runtimeException, (long)-261805940177957112L, (long)l3));
                    }
                    catch (RuntimeException runtimeException2) {
                        throw (Exception)((Object)ye.a("G", (Object)runtimeException2, (long)-261805940177957112L, (long)l3));
                    }
                }
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (long)-170273831071807985L, (long)l3);
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (Object)string3, (long)-130537312686351047L, (long)l3);
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (long)-170273831071807985L, (long)l3);
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (Object)string2, (long)-130537312686351047L, (long)l3);
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (long)-170273831071807985L, (long)l3);
                ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)-132520744353940342L, (long)l3))), (Object)((String)((Object)TF.a("n", (int)9930, (long)(0x3C5852F228C5F25BL ^ l3)))), (long)-130537312686351047L, (long)l3);
                return;
            }
            string = string3;
        }
        Object[] arrobject = new Object[4];
        arrobject[3] = (int)this_2;
        arrobject[2] = l2;
        arrobject[1] = string2;
        arrobject[0] = string;
        ye.a("G", (Object)arrobject, (long)-286097556640771412L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        block23: {
            block28: {
                block26: {
                    block24: {
                        block22: {
                            TF.a = wu.a(753333778227537075L, 5706702572335238689L, MethodHandles.lookup().lookupClass()).a(189125319281575L);
                            var7 = TF.a ^ 43694025576598L;
                            TF.d = new HashMap<K, V>(13);
                            var0_1 = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOe8}$"));
                            v0 = SecretKeyFactory.getInstance(pe.C("qKt"));
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
                            var6_4 = new String[30];
                            var4_5 = 0;
                            var3_6 = TW.C("l\u00dc\u0092\u00a5K\u0081\u00fe\u00d7\u00f4\u0000\u0094]\u00a5\u00d8\u0090\u00d6\u0017zK\u0094;\u00d9\u00dcwH\u00a7#\u0001\u00a6\u000fw\n\u0017\u00fa0\u0095\u00df\u00a3^S\u00cd\u007f\u00d0\u0011w@\u00b40\u00e0\u00f8:\u00ef\u00a6\u0088G\u00f3\u00a4\u0085\u0012\u00be]\u000ba\u0001\u0088\u0011\u00ec\u0001\u0002\u009f\u0000\u0092\u00ad\u009c\u0081\u0093\u00acX,P\u00e4\u009a*O:\u00d1\u00ad\u00b8\u00a6\u00a8\u00c0\u00b95\u0018\u00c2D{l\u0097\f\u00d6\u00ae\u00dc\u00bdU\f`\u00c1Z\u0095\u0017\u0095\u00d7\u00bf\u0088\u00c6\u00eeKr\u009d\u001e\u00baB#F\u0019\u0018\u001a\u00b3\u0086\u00ea\n\u0093\u00f4\u00fb\u00f6Y\u00faA\u00f6B,,UP\u00b9\u00ab|\u001b\u00f9?H\u00c0\u00f6\u0014*kz}\u0087:\u009b\u00d8R<\u00f0-A\u0016]M\u00c1oF+\u00ab\u00b0\u007f\u00fcZ\u00ab`a>\u00b1\u00ec)\u00be\u00c3\u0082;~n\u00b6\u0086A\u001a+\u00cc)\u00bf\u00ce\u0098\u00f8\b\u00dd\u00d7q\u00d3\u00c4\u00a8\u0014\u00c7\u00fay\u009a\u00c33\u001d\u00cdV\u00a7\u00e6uZ\u0011\u00e5\u0091c\u00deL)\u0096\u00f4\u00b3\u00f6\u00c5\u0090E\u0018\u00e8\u00b8=\u00d4>x\"\u001ba\u001e\u009a\u008f\u00c02\u0094\u00f0\u00d7C\u0089\u0087\u00ab\u0016\u0096m\u00f5yR\u00edB\u00c5\u00bdx\u00a2 \u008er\u00dee?\u00e9\u0092\u0086\u00f9\u00b7\u00a8\u00809\u009c\u00ea\u00a23\u001eX\u00b2\r\u00f3\u00e0\u0099\u00b4\u00dd\u00c0\u0083\u001a`\u009ego\u00d7_\u00f4@\u00a9R\u0094\u00e6\u0084\u001c\u009a\u00fc\u009c\u00b0\u009d\u001d\u00cd\u008d\u0096Z\u00c0K\u00daa`\u0003\u00e4\\m\u00b9\u0007\u001bk&/!\u0013|>\u00971\u00c8\u00e1\u00b8\u00d8\f5j\u0012\u00d3\u00c4\u00f3\u00b4#+\u0093\u00f1y\u00f0\u00e8\u00ea\u007f\u0091w\u001d5^P\u00ab\u00ed\u0016\u0084\u00bdX\u0014\u0092Z\u00acg;x\u00fc\u00d5\u00fb\u00e9\u0005\u00b9\u0004^zN\u00f9\u0082\u0004\u008a\u00ce\u0083\u00f9=~K\n\u00f1\u0014\u00a7LD\u00e5\u00fa\u008b\u009c\u00f5Re7i\r\u0010\u00bd\u0096y\u00c1\u00ad\u007f\u00b6\\Y+\u0000\u0093:\u00a9\u00a6&1\u00c1\u0001\u00e2(\u00de\u0003&\u0093\u00f2\u00d9\u0092\u00ad\"\u00a1\u00ae\u001a\u00d7/2\u00e0s\u00cb\u0013Sf\u00fb\nP\u00b60\u0005\u00b8\u00e4u\u0081\u00ab\u00db\u00f4\u0098\u0088)R9\u00da\u00abDAQ%\u00fal\u00b8\u00c9*\u00d4pG\nC\u00cd\u00f9\u00f251\u00d3\u00dc[f\u009d\u00a0\u0088\u00a9\u008fn3\u0080\u00c4\u00c4\u00c5\u00e9S\u001aE\u00c5\u00aaN\u0097\u0017\u00c5\u00ef\u0010[\u00ca\u001d\u001a\u0001\u0096\u001b\u00d1\u008c\u00eb:6\u008b\u00ed\u00ac\u0098o\u0002\u0004\u00e4\u00fe\u0081\u0087%\u00155&\u00f7\u00ea\\s(\u00f3[G'\u0085\u00afk\u000b[$?\u0082\u00c7\u007f\u00d5\u00d6\u00d3\u008a\u00b0\u001ej\u009b9^\u00dei\u0094:\u00fdX\u00d9\u0018\u009d\u0088\u00af\u000e\u0018\u00e3w4\u0013\u00a4g\u0081\u0017\u00e0\u00ff\u009e\u00cfp;\u00e22\u00bexk\u000f\u00a4\u00b7\u00e1\u009c\u00a8\u00f1\u00a6_\u00abd\u0001\u008b\u0018\u008e\u0005\u0096\u0003\u00e5\u00e2\u00102\u0099\u00e5\u001f\u0003G\u00d9\u0093\u0013\u00e7N\u009d\u0085\u00b8\u00af\u00cb\u001e\u00a8\u001b2\u00cdyq\u00c6\u00d0p\u0084\\U\u00a1\u0015\u001aP\u0094\u00c5t_\u0088\u00bf\u00fa\u0089I\u00cd\u00cf\u00de\u001bF\u0016R\u00c1X\u00de\u00c9+\u00d6\u0014~\u008d\u00d0\u0081\u00c2\u0003:\u00d9\u0081l\u00a0\u00eb\u001a\bC\u00cf\u00ca\u00f7\u00cb@v\u0011\u0003)\u00cf\u008e\u0089\u0080s\u00a7\u008c\u00b4\u009b\u009f\u00db*\u00f8\t~Y\u0086\u00d3\u0014\u000e\u00f2y\u00a8\u0001a0%\u00be\u00f0\u00a6\u0092k<K.y\u009f\u009c\u00f5+\u0080\u0093N\u00be~\u00ba}\\\u001d\u00db\u0080\u001fI\u008f\u0017\u00ec_\u00a6 \u0096\u00a3\u0004EA\u0015@\u0087{\u00dd\u0099\u0003\u0002L\u007fh\u0081\u008a\u00d3/T\u00e4\u0006!\u00d3j\u00f8\u00c6\u008f;n \u0080\u00e1\u00ea0\u0012\u00fb");
                            var5_7 = var3_6.length();
                            var2_8 = 24;
                            var1_2 = -1;
                            block18: while (true) {
                                v5 = ++var1_2;
                                v6 = var3_6.substring(v5, v5 + var2_8);
                                v7 = -1;
                                ** GOTO lbl74
                                {
                                    var3_6 = pe.C("\u00a8\u00f7\u00105s\u00cf\u0004@\u00a5\u00f9\u00da_\u00b60\u007f\r\u00c7\u00ab=)\u00e3\u009d\u0087\u00b37\u0082\u00d9\u0095\u0087f\u00bfo\u0005$\u00f1\u00cb$\u00ad\u00c0jkd\u001a)\u00f5CG]\u00c7");
                                    var5_7 = var3_6.length();
                                    var2_8 = 32;
                                    var1_2 = -1;
                                    while (true) {
                                        v8 = ++var1_2;
                                        v6 = var3_6.substring(v8, v8 + var2_8);
                                        v7 = 0;
lbl74:
                                        // 2 sources

                                        switch (v7) {
                                            default: {
                                                var6_4[++var4_5] = TF.a(var0_1.doFinal(v6.getBytes(TW.C("y3hZC\u00134h>r")))).intern();
                                                if ((var1_2 += var2_8) >= var5_7) continue block19;
                                                var2_8 = var3_6.charAt(var1_2);
                                                continue block18;
                                            }
                                            case 0: 
                                        }
                                        var6_4[++var4_5] = TF.a(var0_1.doFinal(v6.getBytes(TW.C("y3hZC\u00134h>r")))).intern();
                                        if ((var1_2 += var2_8) >= var5_7) break block18;
                                        var2_8 = var3_6.charAt(var1_2);
                                    }
                                }
                                break;
                            }
                            TF.b = var6_4;
                            TF.c = new String[30];
                            var1_3 = (String)ye.a("j", (String)ye.a("G", (String)TF.a("n", (int)24279, (long)(2826160695931021945L ^ var7)), (long)-2588638816751351013L, (long)var7), (long)-2580738647075382782L, (long)var7);
                            try {
                                block21: {
                                    try {
                                        if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)15382, (long)(8383086714030016698L ^ var7))), (long)-2456757785755712992L, (long)var7) != false) break block21;
                                        if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)19395, (long)(1919263547239055220L ^ var7))), (long)-2456757785755712992L, (long)var7) == false) break block22;
                                    }
                                    catch (RuntimeException v9) {
                                        throw (Exception)ye.a("G", (Object)v9, (long)-2566567870689890508L, (long)var7);
                                    }
                                }
                                v10 = (Tb)ye.a("Z", (long)-2496823785907186267L, (long)var7);
                                break block23;
                            }
                            catch (RuntimeException v11) {
                                throw (Exception)ye.a("G", (Object)v11, (long)-2566567870689890508L, (long)var7);
                            }
                        }
                        try {
                            if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)25106, (long)(5988488134394058407L ^ var7))), (long)-2456757785755712992L, (long)var7) == false) break block24;
                            v10 = (Tb)ye.a("Z", (long)-2529658387931938194L, (long)var7);
                            break block23;
                        }
                        catch (RuntimeException v12) {
                            throw (Exception)ye.a("G", (Object)v12, (long)-2566567870689890508L, (long)var7);
                        }
                    }
                    try {
                        block25: {
                            try {
                                if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)20544, (long)(1094952984806302944L ^ var7))), (long)-2456757785755712992L, (long)var7) != false) break block25;
                                if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)29372, (long)(8582494598588859927L ^ var7))), (long)-2456757785755712992L, (long)var7) == false) break block26;
                            }
                            catch (RuntimeException v13) {
                                throw (Exception)ye.a("G", (Object)v13, (long)-2566567870689890508L, (long)var7);
                            }
                        }
                        v10 = (Tb)ye.a("Z", (long)-2525567776895411598L, (long)var7);
                        break block23;
                    }
                    catch (RuntimeException v14) {
                        throw (Exception)ye.a("G", (Object)v14, (long)-2566567870689890508L, (long)var7);
                    }
                }
                try {
                    block27: {
                        try {
                            if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)9630, (long)(2941895885903221041L ^ var7))), (long)-2456757785755712992L, (long)var7) != false) break block27;
                            if (ye.a("j", var1_3, (Object)((String)TF.a("n", (int)6412, (long)(6773825304095157688L ^ var7))), (long)-2456757785755712992L, (long)var7) == false) break block28;
                        }
                        catch (RuntimeException v15) {
                            throw (Exception)ye.a("G", (Object)v15, (long)-2566567870689890508L, (long)var7);
                        }
                    }
                    v10 = (Tb)ye.a("Z", (long)-2390636531355848638L, (long)var7);
                    break block23;
                }
                catch (RuntimeException v16) {
                    throw (Exception)ye.a("G", (Object)v16, (long)-2566567870689890508L, (long)var7);
                }
            }
            v10 = (Tb)ye.a("Z", (long)-2508308165803072741L, (long)var7);
        }
        TF.V = v10;
        TF.t = (Base64.Encoder)ye.a("G", (long)-2578400935996833515L, (long)var7);
        TF.S = (Base64.Decoder)ye.a("G", (long)-2393808784309676759L, (long)var7);
    }

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = TF.a(this222, l2);
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
    public static /* synthetic */ void e(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[CATCHBLOCK]
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
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x2BD1;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(pe.C("\u007fWo:jBg\"tFnW\u000fC\u0007+x\\`@"));
                    arrobject[1] = SecretKeyFactory.getInstance(TW.C("\u0015V\u0010"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(pe.C("aYaI)T|S}^qP|LnP\"Mc^p[\u007f\n*n\u001aZa"), exception);
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
            byte[] arrby2 = b[n2].getBytes(TW.C("y3hZC\u00134h>r"));
            TF.c[n2] = TF.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private /* synthetic */ TF() {
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
    private static /* synthetic */ void W(Object[] this) {
        var2_1 = (String)this[0];
        var3_2 = (String)this[1];
        var4_3 = (Long)this[2];
        var1_4 = (Integer)this[3];
        var4_3 = TF.a ^ var4_3;
        var6_5 = ye.a("G", (long)-4902593177423391083L, (long)var4_3);
        var7_6 = ye.a("G", (String)ye.a("G", (String)TF.a("n", (int)30597, (long)(3348838284071068844L ^ var4_3)), (long)-4932840076415603581L, (long)var4_3), (long)-5083074222460604062L, (long)var4_3);
        (String)ye.a("G", (String)TF.a("n", (int)9115, (long)(1030706251709919398L ^ var4_3)), (Object)((String)TF.a("n", (int)13535, (long)(5941534792902944762L ^ var4_3))), (long)-4987167619677650020L, (long)var4_3);
        var8_8 = null;
        var9_9 = null;
        try {
            var8_8 = (Class)ye.a("G", (String)TF.a("n", (int)30686, (long)(5176992790371886328L ^ var4_3)), (long)-4979002733100533287L, (long)var4_3);
            var9_9 = ye.a("j", (Object)((Method)ye.a("j", (Object)var8_8, (Object)((String)TF.a("n", (int)27367, (long)(2543758985057761741L ^ var4_3))), (Object)new Class[0], (long)-5103922263055921867L, (long)var4_3)), null, (Object)new Object[0], (long)-4995609098402664643L, (long)var4_3);
            var10_10 = (String)ye.a("j", (Object)((Method)ye.a("j", (Object)var8_8, (Object)((String)TF.a("n", (int)10225, (long)(1940945025619801291L ^ var4_3))), (Object)new Class[0], (long)-5103922263055921867L, (long)var4_3)), null, (Object)new Object[0], (long)-4995609098402664643L, (long)var4_3);
            v0 = new Class[1];
            v0[0] = String.class;
            v1 = new Object[1];
            v1[0] = var10_10;
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)var8_8, (Object)((String)TF.a("n", (int)16527, (long)(3163993196260578228L ^ var4_3))), (Object)v0, (long)-5103922263055921867L, (long)var4_3)), null, (Object)v1, (long)-4995609098402664643L, (long)var4_3);
            ** GOTO lbl79
        }
        catch (Exception v2) {
lbl79:
            // 2 sources

            var10_10 = (Class)ye.a("G", (String)TF.a("n", (int)2442, (long)(5639565877105531579L ^ var4_3)), (long)-4979002733100533287L, (long)var4_3);
            var11_11 = ye.a("j", (Object)var10_10, (long)-5094858926411867755L, (long)var4_3);
            v3 = new Class[1];
            v3[0] = (Class)ye.a("Z", (long)-5106742432609308051L, (long)var4_3);
            v4 = new Object[1];
            v4[0] = (Boolean)ye.a("Z", (long)-4903122790630608040L, (long)var4_3);
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)var10_10, (Object)((String)TF.a("n", (int)16790, (long)(5900269287990219445L ^ var4_3))), (Object)v3, (long)-5103922263055921867L, (long)var4_3)), (Object)var11_11, (Object)v4, (long)-4995609098402664643L, (long)var4_3);
            v5 = new Class[1];
            v5[0] = (Class)ye.a("Z", (long)-5106742432609308051L, (long)var4_3);
            v6 = new Object[1];
            v6[0] = (Boolean)ye.a("Z", (long)-4903122790630608040L, (long)var4_3);
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)var10_10, (Object)((String)TF.a("n", (int)15774, (long)(844528657936461497L ^ var4_3))), (Object)v5, (long)-5103922263055921867L, (long)var4_3)), (Object)var11_11, (Object)v6, (long)-4995609098402664643L, (long)var4_3);
            var12_12 = (Class)ye.a("G", (String)TF.a("n", (int)31951, (long)(2631566022518665201L ^ var4_3)), (long)-4979002733100533287L, (long)var4_3);
            v7 = new Class[4];
            v7[0] = var12_12;
            v7[1] = Object.class;
            v7[2] = String.class;
            v7[3] = (Class)ye.a("Z", (long)-4991396369108813146L, (long)var4_3);
            v8 = new Object[4];
            v8[0] = var11_11;
            v8[1] = var3_2;
            v8[2] = var2_1;
            v8[3] = (Integer)ye.a("G", (int)var1_4, (long)-4975870923512664159L, (long)var4_3);
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)((Class)ye.a("G", (String)TF.a("n", (int)23083, (long)(8285925719430613251L ^ var4_3)), (long)-4979002733100533287L, (long)var4_3)), (Object)((String)TF.a("n", (int)17256, (long)(2533685575023153222L ^ var4_3))), (Object)v7, (long)-5103922263055921867L, (long)var4_3)), null, (Object)v8, (long)-4995609098402664643L, (long)var4_3);
            (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)var10_10, (Object)((String)TF.a("n", (int)26712, (long)(5090506056187247466L ^ var4_3))), (Object)new Class[0], (long)-5103922263055921867L, (long)var4_3)), (Object)var11_11, (Object)new Object[0], (long)-4995609098402664643L, (long)var4_3);
            try {
                block11: {
                    v9 = var8_8;
                    if (var6_5 == null) break block11;
                    if (v9 == null) ** GOTO lbl212
                    v9 = var9_9;
                }
                if (v9 != null) {
                    var2_1 = (Class)ye.a("G", (String)TF.a("n", (int)1360, (long)(7686158094088476276L ^ var4_3)), (long)-4979002733100533287L, (long)var4_3);
                    v10 = new Class[1];
                    v10[0] = var2_1;
                    v11 = new Object[1];
                    v11[0] = var9_9;
                    (Object)ye.a("j", (Object)((Method)ye.a("j", (Object)var8_8, (Object)((String)TF.a("n", (int)16351, (long)(2854697839716150496L ^ var4_3))), (Object)v10, (long)-5103922263055921867L, (long)var4_3)), null, (Object)v11, (long)-4995609098402664643L, (long)var4_3);
                }
                ** GOTO lbl212
            }
            catch (Exception v12) {
                try {
lbl212:
                    // 3 sources

                    (String)ye.a("G", (String)TF.a("n", (int)9115, (long)(1030706251709919398L ^ var4_3)), (Object)((String)ye.a("G", (boolean)var7_6, (long)-4924772946557189748L, (long)var4_3)), (long)-4987167619677650020L, (long)var4_3);
                    return;
                }
                catch (Throwable var7_7) {
                    throw new RuntimeException(var7_7);
                }
            }
        }
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

