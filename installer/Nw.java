/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;
import net.futureclient.installer.Eh;
import net.futureclient.installer.pe;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Nw {
    private static /* synthetic */ String J;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String j(Object[] this_) {
        String string;
        Object object;
        long l2;
        block10: {
            long l3;
            long l4;
            Object object2;
            CallSite callSite;
            CallSite callSite2;
            block8: {
                block9: {
                    l2 = (Long)this_[0];
                    l2 = a ^ l2;
                    callSite2 = ye.a("G", (long)-6203691579236301685L, (long)l2);
                    try {
                        callSite = ye.a("j", (String)((Object)ye.a("Z", (long)-6102721392195064330L, (long)l2)), (Object)((String)((Object)Nw.a("p", (int)20484, (long)(0x3AC5923ED38D8572L ^ l2)))), (long)-6313515102843799642L, (long)l2);
                        if (callSite2 == null) break block8;
                        if (callSite == false) break block9;
                    }
                    catch (IOException iOException) {
                        try {
                            throw (Exception)((Object)ye.a("G", (Object)iOException, (long)-6301419921977755393L, (long)l2));
                        }
                        catch (IOException iOException2) {
                            ye.a("j", (Object)iOException2, (long)-6106381018606209327L, (long)l2);
                            return (String)((Object)Nw.a("p", (int)4625, (long)(0x4A20B9AD4FB64764L ^ l2)));
                        }
                    }
                    Object object3 = (Process)((Object)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-6339334367845595744L, (long)l2))), (Object)((String)((Object)Nw.a("p", (int)27029, (long)(0x4F4685078E803CEEL ^ l2)))), (long)-6295785072796217923L, (long)l2));
                    ye.a("j", (Object)((OutputStream)((Object)ye.a("j", (Object)object3, (long)-6301587529898091877L, (long)l2))), (long)-6115070132678231880L, (long)l2);
                    object3 = new Scanner((InputStream)((Object)ye.a("j", (Object)object3, (long)-6310634483466601696L, (long)l2)));
                    String cfr_ignored_0 = (String)((Object)ye.a("j", (Object)object3, (long)-6228141828708292772L, (long)l2));
                    String cfr_ignored_1 = (String)((Object)ye.a("j", (Object)object3, (long)-6228141828708292772L, (long)l2));
                    String string2 = (String)((Object)ye.a("j", (Object)object3, (long)-6228141828708292772L, (long)l2));
                    ye.a("j", (Object)object3, (long)-6214821224377986248L, (long)l2);
                    return string2;
                }
                callSite = ye.a("j", (String)((Object)ye.a("Z", (long)-6102721392195064330L, (long)l2)), (Object)((String)((Object)Nw.a("p", (int)22466, (long)(0x6C1B7A1E547F02A5L ^ l2)))), (long)-6313515102843799642L, (long)l2);
            }
            if (callSite == false) return (String)((Object)Nw.a("p", (int)4625, (long)(0x4A20B9AD4FB64764L ^ l2)));
            object = (Process)((Object)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-6339334367845595744L, (long)l2))), (Object)((String)((Object)Nw.a("p", (int)12415, (long)(0x531A70C93E54651CL ^ l2)))), (long)-6295785072796217923L, (long)l2));
            ye.a("j", (Object)((OutputStream)((Object)ye.a("j", (Object)object, (long)-6301587529898091877L, (long)l2))), (long)-6115070132678231880L, (long)l2);
            object = new Scanner((InputStream)((Object)ye.a("j", (Object)object, (long)-6310634483466601696L, (long)l2)));
            block5: for (int i2 = 1; i2 <= 16; ++i2) {
                object2 = object;
                l4 = -6228141828708292772L;
                l3 = l2;
                do {
                    string = (String)((Object)ye.a("j", (Object)object2, (long)l4, (long)l3));
                    if (callSite2 != null) {
                        if (callSite2 != null) continue block5;
                    }
                    break block10;
                    object2 = object;
                    l4 = -6228141828708292772L;
                } while ((l3 = l2) < 0L);
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)l4, (long)l3));
        }
        String string3 = string;
        ye.a("j", (Object)object, (long)-6214821224377986248L, (long)l2);
        return string3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        Nw.a = wu.a(-9106470194774992330L, -8940403102962745500L, MethodHandles.lookup().lookupClass()).a(228191366649784L);
        var7 = Nw.a ^ 16680887728323L;
        Nw.d = new HashMap<K, V>(13);
        var0_1 = Cipher.getInstance(Eh.C("\u0013?=lfJ9x%\u00133\u000eB\n\u00119\t)Im"));
        v0 = SecretKeyFactory.getInstance(pe.C("kzE"));
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
        var6_3 = new String[32];
        var4_4 = 0;
        var3_5 = Eh.C(":\u0005\u0006\u0081\u00bd\u00f5D\u00ab&\u00d4t}\u008d\u007f\u0017\u00ad\u00ce\u009fES\u00c6G)\u00a5C\u00de1\u00c5\u00b6>\u00e5\u00d7\u00da?\u00aa\u009e\u00a1\u00c2\u00e3\u0099E\u00d965\u00f4x\u00aa\u0097\u00dd&\u0094a\u00bf\u00c6\u008aARjT\u008c\u00d9\u00f8\nM\u00bb[\"#?\u0015z\u00cf\bFqRX'F9\u00bbX1J\u00e7\u00f5(e\\p\u0080\u00e8 \u0091\u00a2q\u0006\u00ba\u00a9ZP\u00b9\u001dN\u00f1\u009f\u009b\u001fF\u00c7\u0083*\u00d6Z%f\u00c8\u008a\u00b2<>\u0089\u00e4\u00fc\u009f\u00d7^\u00ae\u0019'sP\u00e3\u00c0\u0097\u00a1\u00aa\b\u00e8\u00f6\u00cf\u00d6\u00a3\u009b\u00ea\u00d9\u00de>\u00c6\u00ae\u00ba\u0011W\u009a\u00feRE\u00d0\u009f_\u00f7N0\u00ednH\u001c!~\u0094\u00bf\u0002\u00a1\u00a0\u00fb\u0004\u0005\u0087xG\u00a0\\w\u0007y,\u0001\u00ff\u00a7E\u00e8r\u00e6\u00b8I\u00e3\u0083\u0007\u0000\u0019\u0010I\u00fa\u00a4pW\u00c2\u00ef\u00b8\u00c6\u0005 \u0012\u000e%\u00b0\u00f2\u00b44\u0010\u0003\u00ad\u00e8\nz\u0013W\u000e\u0085=,\u00fb\u008a\u00e6j\u00b06M\u00a2e\u00f3\u008b\u0088\u00f6B\u00f1\u00e8\u0098\u00f1\u00fbi{^+\u00ddB^\u00f0\u0091\\*\u00c5\u00d4\u00c4R#\u0001I\u00da\u0095\u00e9\u0092\u0006\u0007\u0086\u00c4\u009bt2\u009c\u00b0`_\u00a3\ng\u00d1\u008e\u001e\u00fc\u00c3\u0088:F\u00017\u00e1\u00de\u001dP Tr\u00cciy\u001d\u00d1'?\u0087\u00ee\u00f9\u00a1\u00ca\u00b7\u00b2\u00bc\u00ab\u00bc\u0010\u00da\u0002\u00a7\u00bc\u00b3\u00acH\u0090\"4t\u0088k1X`\u00f8$\u00d7\u00fd\u00df$\u0082\u00b6N\u00c4\u00ba\u00be\u00f1\u00a6h\u008d\r\u00157y7\u00bf\u00f6\u00b3&\u00f5\u00cb\u001bV\u0004/J\u00ad\u00d8\u00b5QF\">p\u00e0\u0093\u0013A\u00f4\u00ee\u00cdml\u00c8,\u00c5\u00c5\u00dd\u000b\u00bc_}g\u0088\u0010\u008a\u00e2\u00c9F\rXB\u0016\u00ea\u000b\u00d4\u0014y\u00d2Yr\u0080\u00ec\u00d8\u00b1\u000f7\u00c0\u00f8\u00cf\rD~*\u0000\u000b\u0092\u00cc)u\u00d0\u00eb\u00d5\u000f\u0003\u00faW!R \u00e4\u00da'\u00ef^\u0084_\u00fb\u0003x~\u00f7\u0087=q\u00ff_\u00ff\u0012\u00a9\u008f;7\u0014\u0010\u00d7\u00de\u00bcjeH0\u00be|}d\u0096T\u00f3:(w\u00df\u00ec\u00ab*\u00feS\u009f\u00f5eg\u00c6v\u0098Pt\u007f\u0096\u0010R\u00a0W\u0001\u0095N\u009d\u0089\u00d9\u00ce\u00a4K\u00f5\u00ef\u00dd\\\u0082\u00da1~\u00e7!\u00adN\n\u001c\u009b\u00fb\u00b8\u0005\u00d4e\u0004\u0005\u00b8\u00e5\u0018\u00e1\u00f9\u0001\u00bf1\u00e862\u0099Kl@\u00aa\u00e0O\u009d\u00fb\u00del\u00b1\u0082\u00a2X\u00afA\u00a1\u000b\u00c6\t1\u00c4I\u00d4f\u00ae\u00fe\r\u00e9\u00b4qrW:/|A\u00abY\u001dB\u0094T\u00884\u00bc\u00be\u00fa\u00a4\u00e9\u00ce\u00d2w\u0090\u00bc`\u001b\u00ae7\u00c4\u009e\u00cf\u00bd\u00e8\u00a45L\u0093\u0000\u0012\u00f8L\u00a4E\u00c4&]g\u00e9]\u00e8\u0019\u0098\u00cf1_\u0011\u00cc\u0084\u00e3\u00ba\u00c7S0\u00ee=L~9\u00b1\u00c1t\u00c2\u0095>\u00cc;o\u00c4\u00a9\u00f1\u0082@\u001e\u0084p\u00f6L\u00ef=\u0096\u0091\u0090\u00f5\u0083D\u001f\t\u00b6\u00a6\u0010\u00bdt\u00ea\u0095\u00b3\\D\u0002Dki\u00b9\u009f\u00df\u009eT!dA\u00b6\u00c76\u0002\u00ba\u001a\u0019b\u0015|y%9\u00d4tr\u00b0\u00cc\u00aa\u00e3\u001e\u00dfu\u00a9\u001b|\u00c8\u00c0\u00c1\u009c\u0005]\u0096\u0019;\u00ee\u008amE\u0089;)W\u00b1\u001b\u001a\u00b9:-~s\u0087\u0012;#9\u00d6\t\u0083}\u00f3\u00b9\u0092\u00e0,\u0098\u0002L f\u00b5\u00d0\u00b6\u00c3\u0090=\u0082W\u00c8S\u009a\u00eb\u0005\u00cd\u0003\u008f\u0004:\u00ab\u00d8\u00d2\u00f0a\u0093\u00db\u00b3v\u008f\u0090\u00d6\u0012+\u00e2h\u008c\u00fd\u00c9V\u00c2t\u00d4~\u00b7f&\u00ba\u001c|\u00fe\u009fdg\u00de\u00ca\u00e8\u0081\u00d3b\u00c1B\u00ad\u0095\u00f3G\u0095\u00a4\u0019\u00cenk.\u0017\u00b0h\u00d7\u001e\u00bc\u00eb\u0087\u0012*\u0010,^!)\u00b9\u008f\u00f7\ts\u0001\u00f3Y\u00ed\u0096\u0007F\u0010\u001d\u00172\u00fddM\u0085\u0003\u00bcCr\u00f3\u008f0mp\u00be\u00e3\u0087b\u00fa\u00cd\u001f\u00ff\u00e2b\u0015X\u00a8\u0006\u00c8D&Y\u00b7\u0007\u00c6\u000f\u0081\u00acZ^M~[\u0096J\u00d6\u00ad\u00b0\u00990>\u009d\u001b\u00f73\u0000\u00b4\u00ee\u0012\u000e\u0097e\u00e8\u00a6\u00abg\u001165\u008f\u00a1X\r\u00bd\u0095Yk\u00bdH\u00af!\u0006oqu\u00e5\u00efX[A\u00a8\u00eb\u00dd\u008bO/\u00c7w\u000bt\u008b\u00ea\u00f2\u0095vAp$\u00a0\u0098\u008a]\u00d0\u00a2\u00fb##-\u00fbj\u0000\u00189q\u00e1\u00e7\t\u0019\u00c0\u001e\u001bb\u001d\u0013\u00b9\u00a9\u00f38\u00c7\\\u00de\u0017\u0013\u0000\u008e\u00f6\u00c9\u00b8o>\u00df\u00bd\u0097K\u0093jJ\u0006Gr\u00f3\u00a3\u00c6\u00058]E\u00b6<\u00e0H\u001e\u00b5\u008c\u0001\u0002\u00e6\u001b0\u0082\u000e\u0096\u0089L\u00b5]\u00c5\u001b\u00f32[9\u001b\u009f\u0014\u00a0\u009d\u00dd\u00be\u00e2\u00ccJ\u00fe\u0010\u00d9\u00e7\u00b5\u00d9\u00af \u0087\u00e7%\u0085Z\u00c3\u00ff2\u008c\u0098n\u0014^\u008d\u00c9\u000fHv\u0084%\u0014\u0000\u00c0\u00d1`\u009a4EKc\u0082\u001f\u0098'\u00f6d\u0000\u00ec\u0092\u00c2\u0011\u00d2q\u00f4W\u0003\u00ae\u00e8}\u00a2HJ\u009e\u0090\u00b8z\u00fd\u00da\u0094o#\u00b2^\u008f\u00ab;\u00fd}\u0004\u00fbo\u00af\u00ff$:K\u0017@fk~\u0014L\u0080Sy\u00ccG\tZ\u00af\u00cc\u00a2\u00d48\u00ab\u00ba\u00cd\u009eKj");
        var5_6 = var3_5.length();
        var2_7 = 40;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var3_5 = pe.C("\u008a\u001aa\u00bb\u0097\u00c6o\u0019\u0096O\u00bfRR\u0006U\u00b5\\\u00b6\u00ff\u00c0\u00ae(\u001c8\u00cc\u00e8\u00050\u00ad=\u00c7\u000e\u00b4Q\nB$\u0014D!I~\u0004e\u001e\u00e9\u0017\"\u00e2\u00af\u00d5`\u000eY\u00f0_6_\u0000so\u00db|\u0005\u0005\u000fF+S\u00c6\u00eb\r9-h_\u00fc\u00e0\u000edy");
                var5_6 = var3_5.length();
                var2_7 = 64;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = Nw.a(var0_1.doFinal(v6.getBytes(Eh.C("9\u000e8wHeXy\n;")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = Nw.a(var0_1.doFinal(v6.getBytes(Eh.C("9\u000e8wHeXy\n;")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        Nw.b = var6_3;
                        Nw.c = new String[32];
                        ye.a("\u00ed", (String)ye.a("j", (String)ye.a("G", (String)Nw.a("p", (int)4044, (long)(5238640741288588144L ^ var7)), (long)-4589029274419095720L, (long)var7), (long)-4429914895292611020L, (long)var7), (long)-4428231378238028749L, (long)var7);
                        return;
                    }
                    var2_7 = var3_5.charAt(var1_2);
                }
            }
            break;
        }
    }

    private static /* synthetic */ String u(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        try {
            if (ye.a("j", (String)((Object)ye.a("Z", (long)-3104515560561159598L, (long)l2)), (Object)((String)((Object)Nw.a("p", (int)13911, (long)(0x7C30724987519C93L ^ l2)))), (long)-2898717515491112958L, (long)l2) != false) {
                String[] arrstring = new String[4];
                arrstring[0] = (String)((Object)Nw.a("p", (int)29822, (long)(0x6A39A7800994DEB2L ^ l2)));
                arrstring[1] = (String)((Object)Nw.a("p", (int)25402, (long)(0x3C87F84F87C9E9L ^ l2)));
                arrstring[2] = (String)((Object)Nw.a("p", (int)7323, (long)(0x277B07729F483656L ^ l2)));
                arrstring[3] = (String)((Object)Nw.a("p", (int)23223, (long)(0x12FE40449E4AF078L ^ l2)));
                Object object = (Process)((Object)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-2908652135132546556L, (long)l2))), (Object)arrstring, (long)-2911544265916082283L, (long)l2));
                ye.a("j", (Object)((OutputStream)((Object)ye.a("j", (Object)object, (long)-2943085629107739329L, (long)l2))), (long)-3132635427869980900L, (long)l2);
                object = new Scanner((InputStream)((Object)ye.a("j", (Object)object, (long)-2897974075798780796L, (long)l2)));
                String cfr_ignored_0 = (String)((Object)ye.a("j", (Object)object, (long)-3011361478309947144L, (long)l2));
                String cfr_ignored_1 = (String)((Object)ye.a("j", (Object)object, (long)-3011361478309947144L, (long)l2));
                String string = (String)((Object)ye.a("j", (Object)object, (long)-3011361478309947144L, (long)l2));
                ye.a("j", (Object)object, (long)-2998049660473889636L, (long)l2);
                return string;
            }
        }
        catch (Exception exception) {
            ye.a("j", (Object)exception, (long)-3128918479889467690L, (long)l2);
        }
        return (String)((Object)Nw.a("p", (int)10756, (long)(0x38FCAA47AE2D80CEL ^ l2)));
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

    /*
     * Exception decompiling
     */
    private static /* synthetic */ String X(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP], 8[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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
    private static /* synthetic */ String f(Object[] this_) {
        String string;
        Object object;
        long l2;
        block10: {
            long l3;
            long l4;
            Object object2;
            CallSite callSite;
            CallSite callSite2;
            block8: {
                block9: {
                    l2 = (Long)this_[0];
                    l2 = a ^ l2;
                    callSite2 = ye.a("G", (long)-3448336710604440250L, (long)l2);
                    try {
                        callSite = ye.a("j", (String)((Object)ye.a("Z", (long)-3277560245064608709L, (long)l2)), (Object)((String)((Object)Nw.a("p", (int)13911, (long)(0x7C303D90CCBE9AFAL ^ l2)))), (long)-3338046802940391829L, (long)l2);
                        if (callSite2 == null) break block8;
                        if (callSite == false) break block9;
                    }
                    catch (Exception exception) {
                        try {
                            throw (Exception)((Object)ye.a("G", (Object)exception, (long)-3368172868616568526L, (long)l2));
                        }
                        catch (Exception exception2) {
                            ye.a("j", (Object)exception2, (long)-3244114687768956737L, (long)l2);
                            return (String)((Object)Nw.a("p", (int)10756, (long)(0x38FCE59EE5C286A7L ^ l2)));
                        }
                    }
                    Object object3 = (Process)((Object)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-3329519591334265747L, (long)l2))), (Object)((String)((Object)Nw.a("p", (int)23402, (long)(0x64073A499653F7D7L ^ l2)))), (long)-3355775744281922448L, (long)l2));
                    ye.a("j", (Object)((OutputStream)((Object)ye.a("j", (Object)object3, (long)-3368339647052192938L, (long)l2))), (long)-3247117915531607691L, (long)l2);
                    object3 = new Scanner((InputStream)((Object)ye.a("j", (Object)object3, (long)-3341358422085467411L, (long)l2)));
                    String cfr_ignored_0 = (String)((Object)ye.a("j", (Object)object3, (long)-3432814484880269679L, (long)l2));
                    String cfr_ignored_1 = (String)((Object)ye.a("j", (Object)object3, (long)-3432814484880269679L, (long)l2));
                    String string2 = (String)((Object)ye.a("j", (Object)object3, (long)-3432814484880269679L, (long)l2));
                    ye.a("j", (Object)object3, (long)-3454957529642685707L, (long)l2);
                    return string2;
                }
                callSite = ye.a("j", (String)((Object)ye.a("Z", (long)-3277560245064608709L, (long)l2)), (Object)((String)((Object)Nw.a("p", (int)11865, (long)(0x1261EEAB77C402FBL ^ l2)))), (long)-3338046802940391829L, (long)l2);
            }
            if (callSite == false) return (String)((Object)Nw.a("p", (int)10756, (long)(0x38FCE59EE5C286A7L ^ l2)));
            object = (Process)((Object)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-3329519591334265747L, (long)l2))), (Object)((String)((Object)Nw.a("p", (int)11739, (long)(0x230ABB68CE3C8170L ^ l2)))), (long)-3355775744281922448L, (long)l2));
            ye.a("j", (Object)((OutputStream)((Object)ye.a("j", (Object)object, (long)-3368339647052192938L, (long)l2))), (long)-3247117915531607691L, (long)l2);
            object = new Scanner((InputStream)((Object)ye.a("j", (Object)object, (long)-3341358422085467411L, (long)l2)));
            block5: for (int i2 = 1; i2 <= 4; ++i2) {
                object2 = object;
                l4 = -3432814484880269679L;
                l3 = l2;
                do {
                    string = (String)((Object)ye.a("j", (Object)object2, (long)l4, (long)l3));
                    if (callSite2 != null) {
                        if (callSite2 != null) continue block5;
                    }
                    break block10;
                    object2 = object;
                    l4 = -3432814484880269679L;
                } while ((l3 = l2) < 0L);
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)l4, (long)l3));
        }
        String string3 = string;
        ye.a("j", (Object)object, (long)-3454957529642685707L, (long)l2);
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ String c(Object[] this_) {
        String string;
        block8: {
            long l2 = (Long)this_[0];
            l2 = a ^ l2;
            long l3 = l2 ^ 0xFACE33C4292L;
            long l4 = l2 ^ 0x431D19213D36L;
            long l5 = l2 ^ 0x69CC5865E56AL;
            long l6 = l2 ^ 0xCC452CE3B5FL;
            long l7 = l2 ^ 0x451FCB7B8F1AL;
            String[] arrstring = new String[7];
            arrstring[0] = (String)((Object)ye.a("G", (String)((Object)Nw.a("p", (int)8581, (long)(0x4CB22267A33BCD8DL ^ l2))), (long)1267333013944815804L, (long)l2));
            arrstring[1] = (String)((Object)ye.a("G", (String)((Object)Nw.a("p", (int)15258, (long)(0x6748B0E7DA1ED78AL ^ l2))), (long)1267333013944815804L, (long)l2));
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            arrstring[2] = (String)((Object)ye.a("G", (Object)arrobject, (long)1329395858420920204L, (long)l2));
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l6;
            arrstring[3] = (String)((Object)ye.a("G", (Object)arrobject2, (long)1261785296227368132L, (long)l2));
            Object[] arrobject3 = new Object[1];
            arrobject3[0] = l4;
            arrstring[4] = (String)((Object)ye.a("G", (Object)arrobject3, (long)1306575942540138711L, (long)l2));
            Object[] arrobject4 = new Object[1];
            arrobject4[0] = l7;
            arrstring[5] = (String)((Object)ye.a("G", (Object)arrobject4, (long)1289307071124246344L, (long)l2));
            Object[] arrobject5 = new Object[1];
            arrobject5[0] = l5;
            arrstring[6] = (String)((Object)ye.a("G", (Object)arrobject5, (long)1264641970787309356L, (long)l2));
            String[] arrstring2 = arrstring;
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = 0;
            CallSite callSite = ye.a("G", (long)1192339608070159855L, (long)l2);
            while (n2 < 7) {
                CallSite callSite2;
                block6: {
                    block7: {
                        Object object = arrstring2[n2];
                        try {
                            StringBuilder cfr_ignored_0 = (StringBuilder)((Object)ye.a("j", (Object)stringBuilder, (Object)object, (long)1304321940811043502L, (long)l2));
                            callSite2 = callSite;
                            if (l2 <= 0L) break block6;
                            if (callSite2 == null) break block7;
                            string = (String)((Object)ye.a("j", (Object)stringBuilder, (long)1294492754342901057L, (long)l2));
                            if (callSite == null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            try {
                                throw (Exception)((Object)ye.a("G", (Object)runtimeException, (long)1290525493620998555L, (long)l2));
                            }
                            catch (RuntimeException runtimeException2) {
                                throw (Exception)((Object)ye.a("G", (Object)runtimeException2, (long)1290525493620998555L, (long)l2));
                            }
                        }
                        if (ye.a("j", string, (Object)((String)((Object)Nw.a("p", (int)11711, (long)(0x43769F04E741A6L ^ l2)))), (long)1226640014436323010L, (long)l2) != false) {
                            object = new JFrame();
                            ye.a("j", (Object)object, (boolean)true, (long)1365166141496002970L, (long)l2);
                            ye.a("j", (Object)object, (boolean)false, (long)1360440822841164299L, (long)l2);
                            ye.a("G", (Object)object, (Object)((String)((Object)Nw.a("p", (int)6259, (long)(0x48094CB34FD7473L ^ l2)))), (Object)((String)((Object)Nw.a("p", (int)7019, (long)(0x51249488E740F773L ^ l2)))), (int)0, (long)1283077481479592297L, (long)l2);
                            ye.a("G", (int)0, (long)1215675903901533969L, (long)l2);
                        }
                        ++n2;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 != null) continue;
            }
            string = (String)((Object)ye.a("j", (Object)stringBuilder, (long)1294492754342901057L, (long)l2));
        }
        return string;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Nw.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
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
    private static /* synthetic */ String J(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[TRYBLOCK]
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

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x7F84;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(pe.C("\u007fWo:jBg\"tFnW\u000fC\u0007+bFQq"));
                    arrobject[1] = SecretKeyFactory.getInstance(Eh.C("\u0007=\u0006"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(pe.C("aYaI)T|S}^qP|LnP\"Mc^p[\u007f\n*t\u0000qa"), exception);
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
            byte[] arrby2 = b[n2].getBytes(Eh.C("\"\u0015x7oB[zUd"));
            Nw.c[n2] = Nw.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }
}

