/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.collections.ObservableList
 *  javafx.concurrent.Task
 *  javafx.scene.Scene
 *  javafx.scene.control.Alert
 *  javafx.scene.control.Alert$AlertType
 *  javafx.scene.control.Button
 *  javafx.scene.control.DialogPane
 *  javafx.scene.control.TextField
 *  javafx.scene.image.Image
 *  javafx.stage.Stage
 */
package net.futureclient.installer;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.ConnectException;
import java.net.Socket;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Eh;
import net.futureclient.installer.J;
import net.futureclient.installer.N1;
import net.futureclient.installer.NB;
import net.futureclient.installer.No;
import net.futureclient.installer.Ti;
import net.futureclient.installer.Tu;
import net.futureclient.installer.Tx;
import net.futureclient.installer.c;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class po
extends Task {
    private static final /* synthetic */ Map e;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;
    private /* synthetic */ c d;
    private static final /* synthetic */ String[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x136C;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])e.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Eh.C(")\u0005+z6\u001a6w,\u001a(\u0015\u0002J\b \u00122\u00162"));
                    arrobject[1] = SecretKeyFactory.getInstance(J.C("8X!"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    e.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Eh.C(".Rn_;\u0002.\u001f5\b#\u0014<\u00106\u0001w\u0015?\u00182Vv\u0005!\u0004t\b:"), exception);
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
            byte[] arrby2 = b[n2].getBytes(J.C("G2\u001d\u00104[&E0C"));
            po.c[n2] = po.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    public final /* synthetic */ Object call() {
        long l2 = a ^ 0x675600939779L;
        ye.a("G", this::x, (long)-4923516264614864938L, (long)l2);
        return null;
    }

    public /* synthetic */ po(c c2) {
        this.d = c2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        po.a = wu.a(-6041769828369120850L, -2074579264969561209L, MethodHandles.lookup().lookupClass()).a(132816228779816L);
        po.e = new HashMap<K, V>(13);
        var0 = po.a ^ 124791992793010L;
        var2_1 = Cipher.getInstance(J.C("H&@S\u0003m\\_@4V)'-t\u001el\u000e,J"));
        v0 = SecretKeyFactory.getInstance(Eh.C("\u0004bY"));
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
        var7_3 = new String[16];
        var5_4 = 0;
        var4_5 = J.C("\u00b1%\u00e7\u001c{\u00c8\u007f\u00c6\u008bC\u00f9\u00b4\u001b\u009a\u00aeXO\u00d0\u00caC\"\u00d0T\u00bafJJ\"|x\u00bd\u00ae\u00d8\u001dbvH\u00a0\u00be\u0099`\u00b5\u00b5g\u0099\u00cb\u00b6\u0099\u00a34\u00d2\u00ff\u0092\u00f6\u009e\u00e9\tl\u00c7\u0090\u000f\u0019J\u0083-jM\u008d\u00df\u00a0\u009c\u00fe\u00e8n\u00a2\u00ed\u00a8\u0099\u0090\u009e\u00db\u00ca\u00bdH/&\u001a\u0081\u0012\u00b40b_1\u00c33\u00f7\u00de\u00ad%\u00d55\u0007\"\u008f\u00ebH\u00e3\u0004\u00a5\u0011\u00d1\u00c2c\u00d9\u00d2\u000e|\u00c9\u00e0\u00d5!L\u00a4\u00f6\u00a5\t\u00ea\u00e2\u00b3@\u0088W\u00e1y:\u00f9v\u00e8\u00e2\u0093\u00de\u009a\u00dc\u0094\u00a1N\u001a\u00fd\u0015N\u00c69y\u0082u@aa\u0012\u00f1\u00a3\u001a\u0094\u00fa\u00ea\u0001l\u0084;\u009b]s\u0099\u001b\u0099~\u00c9>\\\u00a2\u0099KzY)\u00a2\u00b3\u0090c5>$\u00a7\u000e\u00a5\u00f1\u00ae\u00be\u00fe\u00e5\u00b4\u00f7\\\u00fe\u00da1d\u00ea\u00b2\u0004\u001dj\u00ce\u0085!\u0002?\u00bb\u008c_\u00b0\u00e3Wz\u0005\u00f6\u00b7E\"Q\u00cb\u00fbUmK\u00a5a\u0090\u00c1\u0007\u00bc\u008a{\u00a9\u00b3e\u00c0\u001dc%\u00e8\u00b6C\u007fy\u00bc\u001aX\u0003I\u00b3\n\u0089D\u00e7J\"8ob\u00df\u00dcK\u0095\u0000\u0011@kh\u008e.\u0012]\u00fc\u0083]\u008a.\u00b4\fo3\u00c4\u00b1\u00a4\u00f0\u0018I\u00a3,\u00f0\u00eaDf8d\u00ef\u009f;\u0093\u00d5`\u00a0\u00c9v\u00d4KX\u00e2\u000e\u00ff\u00eb\u008f\u001c.<\u00b6eF?\u00b6\u008e4M\u0088\u0084+\u00fa$\u0017\u00ae\u00f1\u008eE\u0087r\u0095\u00d5?\u009c9m\u00a21\u00b3R J\u0001\u0085\u00df_\u00fd\u00c7T\u0007X-\u0015\u00c4\u0001_\u001a\u00e60R\u008czE\u00ea\tKNkxVa\u00fd\u00f9\u00cc\"\u00b9\u00d1\u00e0\u0098\u00c5\u00a8\u00bcfy\u0012\u00a7\u00c4,\u00b4/X{r\u008c\u000e\u00a4\u00a8\u00f9\u00b4\u0018\u00b4XF\np\u0001\u0011\u0006\f\u00f6C\u0005V\u00b27\u0007A!\u00ff9\u00fdd\u00b3?\u009c\u0011\u00140\n\u00a5\u00e6\u0087l\u008b\u009dV\u0086\u00ce\u009d\rG\u001b\u00a8R\u00dc\u009b\u00c4\u00c5\u000b-\u00a1\u00d12\u0084\u00e7\n\r\u0087\u00f1\u0002\u00a0\u0086\u0083B\u00c2u]\u00f1\u00c6\u00df\u00e2`oE~M\u0004D\u0015\u001dH\u00a9\u0088\u00d7\u00ab\u007f\u00c6\u0016\u0092\u00ab}\u00d9#\u00c5A\u0085E\u0090\u0094\u001be\u00f6\u00ff\u00f2!\u0014\u008c\u0014\u00bc\u00baW\u008a1\u00d8\u0088[az\u00eb\u0017D\u00f8\u0004\u00b6\u00d3\u000f\u0014%<I\u0081tQ\u00a6\u0090O\u00cf$\u00d5j\u00d8\u00f3\u0018Uu\u00f0\u0094\u009c\u00b7\u00d0g\u00bf\u000b?%4)\u001f|\u00e2\u00f6C\"\u001c\u00aa\u00b9\t\u00fb\u0007\u0014q=`\u00eb\u008exx\u00934\u0004\u00d8\u009fQ\u00c4\u00bb^\u009b\u00f2\u00d7X\u00db\u008b8:\u00ff\u00aa\u0018\u00b6S\u00e0\u0099\u00b2\u0085\u00a5\u00bc\u008a\u0015\u00e5\u00ed\u00c2\u00a2=\u0097\u00d1|\u00c2\u0098U-}\u009a\n\u0083\u00a9\u00b0;\u0013\u00d3\u009d\u009f\u00f5:A*L\u00ab\u0017\u00e8\u0004)S.\u00ae%\u00ef\u0016\u0000$\u00d9\u00b3\u00ee\u00b42\u000f\u00a8\u00b2e)\u00ec>\u00de\u008b{w\u00c8\u00f3\u00ab\u008b.\u0090e\u00e8KN\u00dc\u0015I\u00d2\u00fb.Jt\u00d3n\u00eb\u00f1E\u0087^e\u0088/\u00e6A\u00a8\u007f\u00e5\u00e4\u0093\u00e81\u00f4\u00d3\u000fXEj\u00a7\u00b34\u00e0z,\u00e2\u00c1\u0096");
        var6_6 = var4_5.length();
        var1_7 = 16;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Eh.C("\u00c2\u001b`Z\u00ef\u00e3\u0004\u00c9\u00b2\u00c4n\u00ec]\u00b8\u00e3\u0090\u00b7\u000fu\u0090\u009aa\u007f|\u00ee>A%\u0097\u00a5\b( 7q\u00a9\u0091\u0018\u00ef\u00ba\u009a\u00b1X:\u0004D\u00ab\u00b5Q\u00da\u00c5\u0085\u00145\u008b\u00c4\u0012\u009d\u00e6M\u00ed\u00df\u00d0\u0017\u001b\u00f3\u009d\u00c4?3\u0012\u00d1\u009e\u0006\u00e2\u0018R?\u00f2U\u00a5%{w\u008d}\u001d:D\u0011\u0084\u00ccH]\u0018\u00e8\u00e9\u00b5?1E-\u009b\u00f9F\n\u00b4l\u0016\u00a8\u0011z\u00b2\u0006\u0012\u008c3p\u00c1O(\u0096\u00ab\u00dc\u00bf\u00ee>(^");
                var6_6 = var4_5.length();
                var1_7 = 56;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = po.a(var2_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = po.a(var2_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        po.b = var7_3;
                        po.c = new String[16];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = po.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    private static /* synthetic */ ConnectException a(ConnectException this_) {
        return this_;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void x() {
        block15: {
            var1_1 = po.a ^ 42129939465902L;
            var3_2 = var1_1 ^ 10616580823475L;
            var5_3 = var1_1 ^ 55272854691929L;
            var7_4 = var1_1 ^ 55792719313935L;
            var9_5 = var1_1 ^ 103712484263067L;
            var11_6 = var1_1 ^ 133164215594442L;
            var13_8 = var1_1 ^ 91454464074939L;
            var15_9 = var1_1 ^ 56027307773165L;
            var17_10 = var1_1 ^ 110530330464839L;
            var19_11 = var1_1 ^ 52297488667845L;
            var21_12 = var1_1 ^ 11905682446123L;
            var23_13 = var1_1 ^ 32925813179958L;
            var25_14 = var1_1 ^ 89317064277768L;
            var27_15 = var1_1 ^ 57148274741705L;
            var29_16 = var1_1 ^ 94132852814515L;
            var31_17 = var1_1 ^ 82042119814785L;
            v0 = ye.a("G", (long)-6121493738465671569L, (long)var1_1);
            v1 = new Object[2];
            v1[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v1[0] = var5_3;
            ye.a("j", (Object)((TextField)ye.a("G", (Object)v1, (long)-6224149328161401662L, (long)var1_1)), (boolean)true, (long)-6095503417333395609L, (long)var1_1);
            var33_18 = v0;
            v2 = new Object[2];
            v2[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v2[0] = var9_5;
            ye.a("j", (Object)((Button)ye.a("G", (Object)v2, (long)-6114904164918707762L, (long)var1_1)), (boolean)true, (long)-6229422947194502237L, (long)var1_1);
            var34_19 = false;
            try {
                v3 = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                if (var33_18 == null) ** GOTO lbl139
                v4 = new Object[2];
                v4[1] = v3;
                v4[0] = var5_3;
                if (ye.a("j", (String)ye.a("j", (Object)((TextField)ye.a("G", (Object)v4, (long)-6224149328161401662L, (long)var1_1)), (long)-6187313074224876743L, (long)var1_1), (long)-6134623506637779486L, (long)var1_1) >= 6) break block15;
                ** GOTO lbl79
            }
            catch (ConnectException v5) {
                try {
                    throw (ConnectException)ye.a("G", (Object)v5, (long)-6185183169753950673L, (long)var1_1);
lbl79:
                    // 1 sources

                    v6 = new Object[3];
                    v6[2] = var7_4;
                    v6[1] = (String)po.a("y", (int)29381, (long)(6726592253098084795L ^ var1_1));
                    v6[0] = (String)po.a("y", (int)26074, (long)(5505759249417821867L ^ var1_1));
                    ye.a("G", (Object)v6, (long)-6219633400816621190L, (long)var1_1);
                    v7 = new Object[2];
                    v7[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                    v7[0] = var5_3;
                    ye.a("j", (Object)((TextField)ye.a("G", (Object)v7, (long)-6224149328161401662L, (long)var1_1)), (boolean)false, (long)-6095503417333395609L, (long)var1_1);
                    v8 = new Object[2];
                    v8[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                    v8[0] = var9_5;
                    ye.a("j", (Object)((Button)ye.a("G", (Object)v8, (long)-6114904164918707762L, (long)var1_1)), (boolean)false, (long)-6229422947194502237L, (long)var1_1);
                    return;
                }
                catch (ConnectException v9) {
                    throw (ConnectException)ye.a("G", (Object)v9, (long)-6185183169753950673L, (long)var1_1);
                }
            }
        }
        try {
            try {
                v3 = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
lbl139:
                // 2 sources

                v10 = new Object[3];
                v10[2] = new Socket((String)po.a("y", (int)31603, (long)(3224678240918028289L ^ var1_1)), 5130);
                v10[1] = var23_13;
                v10[0] = v3;
                (Socket)ye.a("G", (Object)v10, (long)-6138405565551138036L, (long)var1_1);
                v11 = this;
            }
            catch (ConnectException v12) {
                v13 = new Object[3];
                v13[2] = var7_4;
                v13[1] = (String)po.a("y", (int)15379, (long)(6751660966196971375L ^ var1_1));
                v13[0] = (String)po.a("y", (int)27373, (long)(7259610709027770776L ^ var1_1));
                ye.a("G", (Object)v13, (long)-6219633400816621190L, (long)var1_1);
                v14 = new Object[2];
                v14[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                v14[0] = var5_3;
                ye.a("j", (Object)((TextField)ye.a("G", (Object)v14, (long)-6224149328161401662L, (long)var1_1)), (boolean)false, (long)-6095503417333395609L, (long)var1_1);
                v15 = new Object[2];
                v15[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                v15[0] = var9_5;
                ye.a("j", (Object)((Button)ye.a("G", (Object)v15, (long)-6114904164918707762L, (long)var1_1)), (boolean)false, (long)-6229422947194502237L, (long)var1_1);
                return;
            }
            v16 = new Object[2];
            v16[1] = var29_16;
            v16[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v17 = new Object[3];
            v17[2] = var17_10;
            v17[1] = new No((InputStream)ye.a("j", (Object)((Socket)ye.a("G", (Object)v16, (long)-6205429231524556182L, (long)var1_1)), (long)-6165471934712980349L, (long)var1_1), (String)po.a("y", (int)14211, (long)(6219503845203414270L ^ var1_1)), var13_8);
            v17[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)v11, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            (No)ye.a("G", (Object)v17, (long)-6231234554644597588L, (long)var1_1);
            v18 = new Object[2];
            v18[1] = var29_16;
            v18[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v19 = new Object[3];
            v19[2] = new NB(var15_9, (OutputStream)ye.a("j", (Object)((Socket)ye.a("G", (Object)v18, (long)-6205429231524556182L, (long)var1_1)), (long)-6166515954926329399L, (long)var1_1), (String)po.a("y", (int)5393, (long)(6164361124247449191L ^ var1_1)));
            v19[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v19[0] = var25_14;
            (NB)ye.a("G", (Object)v19, (long)-6190362819499286067L, (long)var1_1);
            v20 = new Object[1];
            v20[0] = var31_17;
            var33_18 = (N1)ye.a("G", (Object)v20, (long)-6116746525429986513L, (long)var1_1);
            if (var33_18 == null) {
                v21 = new Object[3];
                v21[2] = var7_4;
                v21[1] = (String)po.a("y", (int)771, (long)(7299884512205060220L ^ var1_1));
                v21[0] = (String)po.a("y", (int)26443, (long)(8544072522542898227L ^ var1_1));
                ye.a("G", (Object)v21, (long)-6219633400816621190L, (long)var1_1);
                return;
            }
            v22 = new Object[2];
            v22[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v22[0] = var5_3;
            var33_18 = new Ti((String)ye.a("\u00c3", (Object)var33_18, (long)-6228156768059209264L, (long)var1_1), (String)ye.a("\u00c3", (Object)var33_18, (long)-6134543188767436161L, (long)var1_1), (String)ye.a("j", (Object)((TextField)ye.a("G", (Object)v22, (long)-6224149328161401662L, (long)var1_1)), (long)-6187313074224876743L, (long)var1_1));
            v23 = new Object[2];
            v23[1] = var3_2;
            v23[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v24 = new Object[2];
            v24[1] = var33_18;
            v24[0] = var11_6;
            ye.a("j", (Object)((NB)ye.a("G", (Object)v23, (long)-6175289976198455674L, (long)var1_1)), (Object)v24, (long)-6169080734889491744L, (long)var1_1);
            v25 = new Object[2];
            v25[1] = var19_11;
            v25[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            v26 = new Object[1];
            v26[0] = var27_15;
            v27 = new Object[2];
            v27[1] = Ti.class;
            v27[0] = var21_12;
            var33_18 = (Ti)ye.a("j", (Object)((Tx)ye.a("j", (Object)((No)ye.a("G", (Object)v25, (long)-6231296912542482436L, (long)var1_1)), (Object)v26, (long)-6231621829441447361L, (long)var1_1)), (Object)v27, (long)-6088653385946170195L, (long)var1_1);
            if (ye.a("\u00c3", (Object)var33_18, (long)-6100901147959642246L, (long)var1_1) != false) {
                var33_18 = new Alert((Alert.AlertType)ye.a("Z", (long)-6115343197266903999L, (long)var1_1));
                ye.a("j", (Object)var33_18, (Object)((String)po.a("y", (int)30067, (long)(2815567567469104650L ^ var1_1))), (long)-6081230292004688338L, (long)var1_1);
                ye.a("j", (Object)var33_18, (Object)((String)po.a("y", (int)10103, (long)(4887795779776519180L ^ var1_1))), (long)-6232948241709102418L, (long)var1_1);
                ye.a("j", (Object)var33_18, (Object)((String)po.a("y", (int)10930, (long)(3501984031823892934L ^ var1_1))), (long)-6152265701959886653L, (long)var1_1);
                var11_7 = (Stage)ye.a("j", (Object)((Scene)ye.a("j", (Object)((DialogPane)ye.a("j", (Object)var33_18, (long)-6090100752940845705L, (long)var1_1)), (long)-6182632148351813924L, (long)var1_1)), (long)-6109350112354903016L, (long)var1_1);
                ye.a("j", (Object)var11_7, (boolean)true, (long)-6080574182396980358L, (long)var1_1);
                ye.a("j", (Object)((ObservableList)ye.a("j", (Object)var11_7, (long)-6109719753911542781L, (long)var1_1)), (Object)new Image((String)ye.a("j", (Object)((URL)ye.a("j", Tu.class, (Object)((String)po.a("y", (int)19010, (long)(3189642163184955701L ^ var1_1))), (long)-6122563376176291630L, (long)var1_1)), (long)-6178619054086968525L, (long)var1_1)), (long)-6207113470361978063L, (long)var1_1);
                (Optional)ye.a("j", (Object)var33_18, (long)-6139165699232917086L, (long)var1_1);
                var34_19 = true;
                v28 = this;
            } else {
                v29 = new Object[3];
                v29[2] = var7_4;
                v29[1] = (String)ye.a("\u00c3", (Object)var33_18, (long)-6119462880145342851L, (long)var1_1);
                v29[0] = (String)po.a("y", (int)32650, (long)(3890543506321523952L ^ var1_1));
                ye.a("G", (Object)v29, (long)-6219633400816621190L, (long)var1_1);
                v28 = this;
            }
            v30 = new Object[2];
            v30[1] = var3_2;
            v30[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)v28, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            ye.a("j", (Object)((NB)ye.a("G", (Object)v30, (long)-6175289976198455674L, (long)var1_1)), (long)-6101447739180285918L, (long)var1_1);
            v31 = new Object[2];
            v31[1] = var19_11;
            v31[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            ye.a("j", (Object)((No)ye.a("G", (Object)v31, (long)-6231296912542482436L, (long)var1_1)), (long)-6151791176895456734L, (long)var1_1);
            v32 = new Object[2];
            v32[1] = var29_16;
            v32[0] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
            ye.a("j", (Object)((Socket)ye.a("G", (Object)v32, (long)-6205429231524556182L, (long)var1_1)), (long)-6149844996054859655L, (long)var1_1);
            v33 = var34_19;
            ** GOTO lbl480
        }
        catch (Exception v34) {
            ye.a("j", (Object)v34, (long)-6209462189353006186L, (long)var1_1);
            v35 = new Object[3];
            v35[2] = var7_4;
            v35[1] = (String)po.a("y", (int)10771, (long)(8113505339501613411L ^ var1_1));
            v35[0] = (String)po.a("y", (int)26354, (long)(1495930572722462081L ^ var1_1));
            ye.a("G", (Object)v35, (long)-6219633400816621190L, (long)var1_1);
            try {
                v33 = var34_19;
lbl480:
                // 2 sources

                if (v33 != false) return;
                v36 = new Object[2];
                v36[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                v36[0] = var5_3;
                ye.a("j", (Object)((TextField)ye.a("G", (Object)v36, (long)-6224149328161401662L, (long)var1_1)), (boolean)false, (long)-6095503417333395609L, (long)var1_1);
                v37 = new Object[2];
                v37[1] = (Tu)ye.a("\u00c3", (Object)((c)ye.a("\u00c3", (Object)this, (long)-6192408982772490956L, (long)var1_1)), (long)-6100371284282033533L, (long)var1_1);
                v37[0] = var9_5;
                ye.a("j", (Object)((Button)ye.a("G", (Object)v37, (long)-6114904164918707762L, (long)var1_1)), (boolean)false, (long)-6229422947194502237L, (long)var1_1);
                return;
            }
            catch (ConnectException v38) {
                throw (ConnectException)ye.a("G", (Object)v38, (long)-6185183169753950673L, (long)var1_1);
            }
        }
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

