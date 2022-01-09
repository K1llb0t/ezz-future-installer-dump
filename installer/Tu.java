/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.application.Application
 *  javafx.beans.value.ObservableValue
 *  javafx.collections.ObservableList
 *  javafx.event.EventHandler
 *  javafx.fxml.FXML
 *  javafx.fxml.Initializable
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.control.Accordion
 *  javafx.scene.control.Alert
 *  javafx.scene.control.Alert$AlertType
 *  javafx.scene.control.Button
 *  javafx.scene.control.ChoiceBox
 *  javafx.scene.control.DialogPane
 *  javafx.scene.control.PasswordField
 *  javafx.scene.control.ProgressBar
 *  javafx.scene.control.TextField
 *  javafx.scene.control.TitledPane
 *  javafx.scene.image.Image
 *  javafx.scene.text.Text
 *  javafx.stage.Stage
 *  javafx.stage.StageStyle
 */
package net.futureclient.installer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N8;
import net.futureclient.installer.NB;
import net.futureclient.installer.No;
import net.futureclient.installer.TA;
import net.futureclient.installer.X5;
import net.futureclient.installer.c;
import net.futureclient.installer.pI;
import net.futureclient.installer.pV;
import net.futureclient.installer.pe;
import net.futureclient.installer.pu;
import net.futureclient.installer.vX;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Tu
extends Application
implements Initializable {
    private static final /* synthetic */ Map a;
    private /* synthetic */ ProgressBar V;
    private /* synthetic */ NB E;
    @FXML
    private /* synthetic */ Accordion C;
    @FXML
    private /* synthetic */ TextField Q;
    private /* synthetic */ double T;
    private /* synthetic */ No v;
    @FXML
    private /* synthetic */ Text w;
    @FXML
    private /* synthetic */ TextField k;
    private /* synthetic */ int d;
    @FXML
    private /* synthetic */ Button P;
    private static /* synthetic */ Stage h;
    @FXML
    private /* synthetic */ ChoiceBox u;
    private /* synthetic */ Scene r;
    private static final /* synthetic */ long c;
    @FXML
    private /* synthetic */ TextField H;
    @FXML
    private /* synthetic */ Text U;
    private /* synthetic */ long n;
    @FXML
    private /* synthetic */ PasswordField Y;
    private static /* synthetic */ String M;
    @FXML
    public /* synthetic */ Text s;
    private final /* synthetic */ String[] X;
    private /* synthetic */ Timer b;
    private static final /* synthetic */ String[] g;
    @FXML
    private /* synthetic */ Button m;
    private static /* synthetic */ Path D;
    private /* synthetic */ int x;
    private static /* synthetic */ Stage y;
    private /* synthetic */ double o;
    private /* synthetic */ Scene G;
    private /* synthetic */ boolean L;
    @FXML
    private /* synthetic */ Text K;
    private /* synthetic */ Socket e;
    @FXML
    private /* synthetic */ Button t;
    private static /* synthetic */ Stage i;
    private final /* synthetic */ String[] I;
    @FXML
    private /* synthetic */ Button S;
    @FXML
    private /* synthetic */ Button R;
    private static /* synthetic */ String j;
    private static final /* synthetic */ String[] f;
    private /* synthetic */ pV W;
    private /* synthetic */ int J;

    public static /* synthetic */ String[] Z(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (String[])ye.a("\u00c3", (Object)((Object)tu), (long)-8662085629101558405L, (long)l2);
    }

    @FXML
    private /* synthetic */ void Y() {
        long l2 = c ^ 0x1C454DD43189L;
        long l3 = l2 ^ 0x2353032F2A2EL;
        try {
            Object[] arrobject = new Object[2];
            arrobject[1] = l3;
            arrobject[0] = (URI)((Object)ye.a("j", (Object)new URL((String)((Object)Tu.a("c", (int)12240, (long)(0x144AA8C33C7857E5L ^ l2)))), (long)-9024871152201575527L, (long)l2));
            ye.a("G", (Object)arrobject, (long)-8966091079939683573L, (long)l2);
            return;
        }
        catch (Exception exception) {
            ye.a("j", (Object)exception, (long)-9180632040696896814L, (long)l2);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void W(ObservableValue this, TitledPane this, TitledPane this) {
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

    public static /* synthetic */ int W(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        int n2 = (Integer)this_[2];
        l2 = c ^ l2;
        int n3 = n2;
        ye.a("F", (Object)((Object)tu), (int)n3, (long)6707763187996309247L, (long)l2);
        return n3;
    }

    public static /* synthetic */ ProgressBar w(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (ProgressBar)ye.a("\u00c3", (Object)((Object)tu), (long)-6326276716914034549L, (long)l2);
    }

    @FXML
    private /* synthetic */ void u() {
        long l2 = c ^ 0x79A9A66EC221L;
        ye.a("j", (Object)((Object)new c(this)), (long)8199718792739028425L, (long)l2);
    }

    public static /* synthetic */ void L(Object[] this_) {
        long l2 = (Long)this_[0];
        String string = (String)this_[1];
        String string2 = (String)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x23BEAA5FFEF1L;
        Object[] arrobject = new Object[5];
        arrobject[4] = string2;
        arrobject[3] = string;
        arrobject[2] = (String)((Object)Tu.a("c", (int)23500, (long)(0x195952880584D6DEL ^ l2)));
        arrobject[1] = l3;
        arrobject[0] = (Alert.AlertType)ye.a("Z", (long)-686461680130883098L, (long)l2);
        ye.a("G", (Object)arrobject, (long)-736906953660091451L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        Tu.c = wu.a(1354929296526265671L, 6463274874362912340L, MethodHandles.lookup().lookupClass()).a(199887946614568L);
        Tu.a = new HashMap<K, V>(13);
        var0 = Tu.c ^ 97063517086293L;
        var2_1 = Cipher.getInstance(pe.C("\u007fWo:jBg\"tFnW\u000fC\u0007+x\\Ss"));
        v0 = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
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
        var7_3 = new String[65];
        var5_4 = 0;
        var4_5 = pe.C("Hb\u001cO\u009a\u00ed\u00f2\u00cd\u00d3C\u00f0\u0087\u00dfF\u00e5:2E<\u008e\u00b3\u00fd\u00f6O\u00e8\f\u0080<F\u00ce\u001b\u00b6\u0018\u0083\u00e0\u0094\u0017\u007f2\u00af\r\u00ceZ\u0018\u00bbh\u00f6\u00ff\u009d\u00e0\u00c2\u001dX}V:\u0091zxwF=E\u00af\u00f0/]\u00018s/\u00fc\u008f\u00eb\u00be\u0001\u00b4{O\u00e7\u00b8\u0014\u0015\u00dcMq\u00ad\u00fa\u00c5u\u00beo\u00b2\u00e3o\u00f8MC*a\u001dC\u0003\u00e5\u00c5\u0083)=\u0080\u0012jg\u001d\u00c6#\u009dH\u00890\u00e3\u00c5'\u001b\u00adG\r\u00acmr\u00ec\u0005#\u00b6T\u00ee\u00ff\u009di\u00a0\u00d0\u00be\u00ec\u000fE\u00a51\u00ffu\u00a0\u009c\u00cd\u000e1\u00b4Q\u009b\u00fc\u00a6\u00d4\u0013\u0099\u0096\u00fe\u00f9\u0012\u0003+\u0094\u00d9\u00a3.\u001f.\u001b\u00ed\u00cd\u00fb[\u00e0c\u00eb\u0082\u009f\u00b3(;%\u009f\u001dCdm\u00eb\u00fc\u00fe($\u001b\u0093\u0007\u00af\u00a7\u00de\u00cap\u00b1E\f\u00cf\u0084\u00b3\u00a9\u00b9S\u00f4\u0005`\u00e9\u0096\u00ef\u000f\u0010mNe\u008c\u00c3\u000b\u000e\u0081\u0002t\u0094\u00f3\u00ae\u00aa;:;a*\u00fa\u0014\u008e5m\u00ec\u0090\u001c\u0089\fW\u0003\u00ba\u00e1L\u00d5\u00e6\u0010\u00f0\u00f5\u00c4\u00ef\u0083\u0099\u00ceB6\u00a4M\u00ba\u00c4\u00b8`\u008e\u00e9\u0088Ag-#\u00e6\u0090d\u0098\u00c4T\u0003\u0095\u00e3\u0005\u0095\u0089n!m{\u00e2\u00f3\u00af\u00ea\u00ffS\u0083\u00f6\u00ad\u00fc\u00e7\u009b\u00e1\u0098\u00f2\u0014\u009e\u00b1%\u0080\u00198Z\u00e5\u009fS\u0005\u0096\u00fe\u0092,}!\u001c\u00c4\t'\u008c\u00ca\u00fd\u001a' \u00b5\u00e2-\fM\u00ea\u00b8/\u00a6\u00c4l\u000f/,\u009e\u00da\u008d)\u00d8\u00d9Eg\u0007\u00e6\u001d;m\u008f\u009c\u00ab\u00d0\f\u00c3\"\u0003\u00c9\u00a1\"\u00f7\u00fb\u00e9\u0003\u00d2\u0092eO\u00bf\u00c2\u0097\u0001\u008a\u0090\u0000\u00d9\u00c5\u00bc\u009b\u00c4\u0090\u0006\u0093\u00d9\u00d7>\u00a1\u00fc\u0080\u00eb\u00fd\u0017n\u0092\u00a3ff}\u009a\u0088\u00a6&\u00c2\u0089\u00d7\u00f8\u00c1pe|X(\u008b\u009e\u00f7i\u00bf\u00e7\u00a1$)\u0080\u001e\u00bdt\u00fb\u00c9\u00a9\u00c0\u0004\u00b2AW\u009e\u008c\u00aa\u00af\u00e8\u0089\u0084\u00c7=B\u0096\u0085\u001f\u00e7\u00d4\u00f74\u009d\u00a7\u00cb\u00b55\u0092\u0014\u00dfw|e\u00e7\u0096\u0081\u0081E}MZF\u0004\u00b4\u00111\u00c1\u0080n]\u00f5b\u001dh\u00e6\u00e2\u00cd}\u0016:\u00c9\u00fb'D)\u009c\u00dc\u0016\u00b8\u0099\u0081z\u001b_/\\*\u00bc\u00c0\u00ed(3R\"o\u00aa#\u00d6U\u0016H\u0011_*\u0092gMZ\u00ac\u007f\u0006\u00c2\u0001\u0081O\u008b\u00ae\u0005w}y\u000fB\u009f\u009c\u001a6\u008e \u008a\u00ef(/\u00148\u00a6\u00155\u00acCoRU\u0081\u00d8\u0006\u00f8\u00fd$\u00fd\u0083n\u00d8\u0096>\b\u008a\u00c0\u00ab\u00a05\u00ed\u00b6\u00bf\u00f6\u000f\u0015\u00a5S\u001er-i\u00a3#\u009f\n\u009d\u00e9b\u0098\u00e5#\u001aHO.n.\u00c2\u0018=3-\u00171\u00c2\u00ce\u00d3\u0099\u00a1\u00de\u0012_\u008a9#\u00ac,\u0093\u00bd0{\u00c7e@=d \u00ee\u00bc\r3\u001b\u00b0f\u000b\u00cf\u0019\u00d76\u00f4\u008eO\u00a11\u00c8+\u00ae\u009d\u00fc\u00eb\u001e<ku\u00d3\u00e5\u00d0=\u0087r\u00e3o%\u008eB\u0097\u00f3^\u00bf\u00cfJ\u00d0v\u00e54\u0098\u00de\u00ed\nm\u00e2e\u0082\u0085\u0094\u00d5\u0098&\u00b2\t\u00e2\u00ea\u0019)\u00c59t\u009f\u00fa\u0004\u00d3N\u00e2\n\u00a5S\u00d4\u00c1\u00b8zG\u00c4\u0014\u00df\u0093\u00b7\u00c1\u00a3}\u0099\u0002\u009dS\u00e0B\u0088\u00ae\u0002\u001e\u0019\u0097\u00ac(\u00dc9[\u00e0M\u0007\u00de\u00cd[}h\u009ba\u00f9\u00aa\u0081_6\u0092\u0016l\u0098\u0088#\u001aOB_\u00c3\u0083\u00b4\u00a1\u00b1\u0001%\u00eft\u00dc\u0004\u0091O\u00818I\u0095\u0080\u000f]\u001c\u00f3\u00d2\u00b4\u009eV[Lz\u00c8\u001e\u00e5t;\u00a8\u0093\u00bc\u00f3$3F'\u00c5^\u00bd\u0098\u0092\u0082@\u00b1!g\u009a\u00fd\u0094tG\u00b4Xk_\u00c61\u00a2\u0098v\u00c5\ff\u00b1\u00c3\u00029\\\u00e4t\u00a0\u00a9\u00b6\u00df\u00e1\u00f3j\u00aec\u008fR6bh<\u00e2?/\u0015cS\u00da\u007f\u008a\u009e\u00ff>\u00ec\u009d\u0013\u0010\u00dd>\u00c1\u0000\u00c20\u001d\u00a5\u008d\u0099|\u00c6\u00e2\u0015\u0091X~\u00a0\u00abna\u0089\u00a0\u00a2MX\u00bc\u00a4\u00a7\u00ff_\fq\u001b\u001eg\u0086X\u00d9\u00e357jG\u00fbf\u0002i\t\u00c2\t\u0000\u008f\u00e37\r\u00bf9\u00a1\u0015\u0099Z\u00fc\u00f3\u000f\u00e36/n\u0015\u0093\u00c2\u001b\u0013\u00c41 [\u00d8gf\u00f0\u00a5\u0010|\u00de\u001d\u00d4Y\u0085p6\u00ca\u00a5)\b\u00d9#5\u007f$\u008c\u00f0\u0017\u00e0\u00f9\u00cf\u00f9\"\u00fb&\u0097\u00b4\u0083\u0097\u00ef\u00ebS\u001d\u008f\u00db\u00bc\u00ed\u00fb\u000b[\u0097O\u008c\u000f\u00ce|i\u0015\u0013?\u00bf=\u00cb\u00fa\u00cc\u00fc}M\u0081\u0082v0\u00d2\u009ay=\u00e6\u0000\u00b6\u00d3\u00c8M\u00b83wV\u00bf1\u00f9\b\u00ef\u00af\u0088\u00fa\u0081K:I\u00c4]\u00e8\u0084\u00a6h\u00b9)\u00dd9\u0001*\u00c8)g\nX\u009d\u00a4\u00bfx\u00e3/(\u00f7\u0011\b\u00cc\u001e\u0005\u00bfK\u00b3\t\u0087q\u00f6d\u00ca\u00f1U\u00b0\u00b5\u00c1\u0010\u0089T\u0012z\u00f3\u000e\u00b8\u00e8\u00bd\u00fa\u00c7\u0099\u0013\u00c7\u0092\u00b6\u00d5\u00a8\u00e6\u00e7\u00b4\u00a06Pk\u009a\u009d\u00aeL|-\u00bd\u0092=\u00efm\u0015\u001d\u0001\u0085B\u00ba\u00c5\u00ca\u008dJ\u00b2,\u00beh\u00c8h./\u00d2Np]i\u00e5\u008f\u0086S@-\u008c\u00ed\u00de\u00b9\u00aa7\u00f5\u009f\u00f46\u001c!\u00f9\u00fb\u0099\u0088\u00ce\u007f\u0081i\u00cdb\u00bf\u0099\u00ac~$?\u00c0 4u\u00d7I\u00db\u001frQ\u00f0\u00d1]\u009f+\t\u0088,\u0005st+\u00f4\u00d3/\u00d4P\u009dt)\u0087f\u00a2\u00f6}\u001b\u008d\u00a2\u00ff\u00fe\u00a5\u009d\u000eZ\u0088\u009dJ^\u00cf\u00c3\u00ae\u0083\u0082T\u00e1\u00a8\u00c7c\u00d3q\u00f7\u00a4\u00f1\r\u00f8j\u008a\u00c1\u0011\rYe\u000f\u00d2[\u001a3\u0005\u00bbZ\u008e\u000b\u00d4,z*\u00bb\u007f\u00f8\u0000\u00f4ZS\u0018r\u00b2\u0084u\u00b7\u0013_j\u0099\u00d0\u00f06\u00e8Q\u00cf\u00d50\u00e9o\u0003\u0087kv(\u0017\u00b1%8W\u00f4\ff\u009cg\u0001\u00ef\u001d!\u00f6\u00d6$Cw0\u00e7\b\u008f\u0000+(\u00c7}\u00ce\u00a5\u0006>K3K$\u00a3\u00da_\u00e47\fu\u00e4]\u0084\u00ac\u0004l?\u00a0\t\u00e4a\u00f6 \u00d3\u0086\u000e\u0086UZ(W\u000e\u0018I\u000fZ\"FB\u00fc\u001aB_\u00a1W\u00cd\u00ca\u00fd?\u00b1\u009b\u0006\u0006\u00e0\u0084\u00ec`\u00d1\u009b\u00e5S\u00bb\u0010_\u0080(\u00edz\u009e\u001c\b\u00a2\u0018\u00ad\u0019\u0084(A\u00a8\u009a\u00d9\u0092+ \u0010K\u001eD\u00b8\u0004\t\u00bf\u0012{L\u0099+\u0095A\u00e9UP/C\u00efS\u00c4K>\u0097\u0097\u00f9\u00a4KWO\u00a9\u0005\u00f9G\u000e\u00de\u0092\u0002\u00c0\u0082\u00fe\u00f6\\\u00e7\u00cf8\u0085\u00e3\u00c9\u00ac\u001f\u0087\u00d8\u0097\u00d6h\n'\u00ce\u0000X\u00a9b\u00a4_\u00c3\u00e5\u000fl\u00c3\u00bd\u00a3\u00bf\u00cb\u0019\u0080\u00ddbt\u001f$\u0092\u00a0\u00be\u0006kO\u00bfR\u00e2Y\u00bc|=\u00c9]#rP\u00a4\u00f7hD\u00fb\u008d\u00dd\u0016\u00e3\b\u00c7\u00f1\u00e1\u00baM\u00a9\u00f5\"\u0016\u00d2\u00f94\u00c5\u0006 B\u00c4|n\u0000\u00eb\u008e\u001bS6F\u00de%\t\u00faj\u009cm1O\u00aa\u00de\u0093\u00b3\u00ab\u00dcG\u00fb\u0091\u00f8K\u00ad7\nq\u00d1\u00a6\u0099MG\u00d3\u00a5&\u00e1\u008f\u00d42R\u0013S] \u0092\u00e9\u001d\u00c9\u001cC\u007f'\u00c7O\u001eAI\u00ad\u00fex\u0092\u0001\u00cf\u0090\u0005\u00c6\u00b0\u001f\u00fa\u00e4\u00c2C\u0003\u0006_8\u009f\u00de\u00dbs\u0092\u00f4\u00e3m\u00f3\u0012\u009d\u00b6F#f\u00fdZXF\u00b6\u00b9\u00c6)WI\u00a4a>\u009bd\u00a9;\u00fdnhOv\u009c\u00be\u00ccK\u00c5\u00db\u00da\u0013`\u00c0f\u00ab\u00ce\u00b1N\u00d3\u00f2\u0003{hxn_\u008c\u00ef\u0012\t\u00a5U\u00b63xz\u00c5\u00bc*L\u0006Q\u00dd\u00fc[6\u00bc\u00a1\u00c0r\u00d4pV}x\u00a1\u00df\u00c9\u00e8\u00b2\u00b9WSml\u009e\u0095\"\u00d6\u008ew\u00a2c-\u0090\u00e7v\u00ef\u00fb>\\\u009c*[@GX\u00b6\u008c\u000f\u00d3\u00ff\u00c3\u000b\u00a7u\u00d1pk\u00a9\u00b8\u00f8jN\u00ea\u00eco\u001b\u00acm\u000f<\u00ecI\u00b6-\u00f5\u00dc>WS|\u00a2\u009e\u00ccY\u00e5\u000eL;\u00b24\u009c\u00ef@q\u009d.\u0018U\u00cb\u00d5K\u00ee\u00df\u007fZ\u00e0\u00fa\u008c\u00aa\u0083\u00d2\u00faF\u00c2\u001e\u00b1`\u00d05\u000bR\u00a0\u00dd\u0092\u0097\u001eN\u00c3\u0092*\u00a3|\u0002\u00abz\u00e4Q\u00c1/\u0004\u0019\u0095,g\u00ed\u001f\u00f2?\u00bc\u00a9\u009b\u001e\u00bax\u00d8\u00b7\u00ce\u009c3\u0081-\u001a>\u007f\u00f3\u00bc\u0018;E0Vm\u00b1\u00873U\u008a\u008d\\HP\u00ac(\u00b3\u00be\u0090w_\u00f4\u0094XI\u0011C#\u00cc\u00e6j\u001c\u0011\u008e\u00b5\u00ce\u009b\u001a8@\u0092\f\u009e\u009a\u00e1\u001d.\u0084\u007fN=)\u009a\u00e6?\u00b1\u00e0\u0010\u0015\u00d4W\u00f0l\u0096\u00c9\u008b\u0016\u00bc\u0016\u00be\u0002cO\u009az\rcgA:c\u009b\u007f\u0084\u008b\u0017\u00c0f\\C'*\u00db\u00ff\u0093\u008a:x\u00b5\u0018\u00013\u00eb\u0012rV;Q0\u009c=1|\f\u00d1\u0088\u0012\u00c5\u00b7 d\u00e7\u009f\u0010\u000f\u00e5.\u001fZ\u00d2\u00e7\u0083\u0016\u00e8\u00cbK\u00e4N\u009e\u0093\u0086\u00d0\u00e4\u009e~8\u0081\"\u0012\u0093\u00ae\u00149kF\u00ae\u00e4\u00da\u00b7\u00a3\u00a3\u000b\u007f\u00b6\u0013\u0018\u00efG\u00a4\u00a4\u00ea\u00f7X\u0088\u00f5\u00f5\u0005O\u009e}\u0018\u00d2B\u00a8\u00afG3\u009c\u00dc$\u00f21{\u00c2\u00df\u00aa\u001d>\u0089@j\u00a8\u00a6u\u000e\u00b0\u00de\u00bf\u0001\u0093?\u0005\u00c3%b\u0096\u00f7\u00ca\u00cf|\u00f4\u0081\u000ee\r\u0014\u00c1\u00ff\u0016+R\u00e3\u00e6(=\f\u00aeF6\u00c2\u00c8\u001e\u0016x\u00f6/\u00e4\u00bc\u00a19w@\u0012\u00db4\u008a\u00f9\rl\\F\u00e4\u00e9f\u00c2\u00e4\u0012T,\u000b\u0088\u000fh9\u00d1\u0091\u00dc\u00cd\u00f7D[\u00eeg\u00d8\u00e7\u00e2\u00d9C\u0000\u00d2z\u00c1\u0085\u00b9\n\u00ef\u00be\u00d7i`\u00d9\u0014\u0097\u00da\u00f1S\u009a\u0007\u00bf\u00ec'Qz3\u00e2\u00c3\u0082\u008c\u00cd\u0002w\u009f\u0088\u00e1Z\u000b\u00fe&\u0012\u00e5\u00e2\u000f%\u0092cT\u0015\u009b\u00a5\u00b6\u00b6\u0010\u00ee%d\u00b38gL\u0089`(E\u001bd\u00e8\u00a8t\u00ee\u0098C2M\u009d\u00df7\u0083\u00c14Q\u0016y\u001b\u0006\r\u00cb\u00f1%FJ\u00c8@'r\u0093\u008b\u0006\u009a\u00e3koDs\u00b1\u00cdicK+G\u00c4(S\u00a5\u009b',n\u000e\u00db\u00bd\u0006\u00ea\nfZ\u00ec\u00e9\u0019\u00c4K\u00d0\u00fe\u00a3el^\u0092\u000f\u00ba\u00cc,\u00e0\u0097\"\u008f`\u0084\u00de\u00e8%j\u0090|k)\u00b08\u00be\u00aek\u00a0\u0000\u009eM\u0097\u00d4A0\u00f3\u00e5\u00e2b\u00bfZT\u00bdx~\u00c5\u00f3$\u00a0\u008c\u00dcMpW\u0012\u00bb\u00e3\u00f7\u00afH\u009b\u00aai9\u0014\u00e8G\u0090\u00a9\u00f4d\u00d9\u00bb\u0097\u0001n\u001euk1\u00b0\u00e5\u0013\u0083\u00ce:\u00de\u00c2qL\u00b8z\u008b\u00a8\u0002\u00a9\u00ec:\u0018H\u00e0\u00b5\u00d2yF\u00fbr\u001c\u008ff\u008bJ\u008d\u0092\u00e8^+Jpqx\u00ff\u0007\u0096.c\u00b9/>\u00c5e\u00be2\u0015%\u0099\u00b0\u0096Cz\u0002\u00e9\u00e7\u00e5N!\u00cbGK\u00dc\u008bH6\u00a3|\u0016+:\u00ac\u0088W\u00e819\u00aak\u00ad\u00fa\u00ea\u00be\u00a9\u007f\u00be\u0012\u00c6\u00b0\u00f4D{\u0088\u0083\u00f2.\u008a,\u0094\u00c2\u00a2@\u00b2\u00f2\u0011\u009e\u00da\u00d7iw\u00a8\u00cb?FP\u0095\u00da\u00ea\u00e8\u0085\u000f\u0019\u00a1\r\u0013H\u000br\u0094.\u0002\u00c7\u0002\u00c2\u00ec\u009d\u008d\nZ\u00fa\u00aa\u00bf%\u0086=\u00d6\u00df\u00d8a5\u00be\fg\u00ca\u0001\u00b2\u00afV\u00ab\u008a\u00fa\u00eco\u0088\u00a4.\u009e\n\u00a6\u009a\u00ed\u00cd\u0083b\u00fd\u0091p\u008b\u00d6B$\u00db\u00b2\u00ac\u0083\u00d6N\u0000\u00a3y^\u00fa ;\u00d0\u00ac\u00b7\u001b\u0083Q\u00cc\u00bd\u00de\u008d\u00fd\u0000UQ\u00bd\u0006\u0002OE\u00d8@\u00e3\u00e7X\n\u00de\u0016\u00b6\u0097\u00d3\u0004\u0000\u00e1\u00ec\u0095\u000f\u0081J9\u00cf\u009c9o\u00b15\u00d4\u00c26\u00a6\u00a1\u00f9\u00ec\u00d8\u007f\u00f8\\\u00bfp\u00f5\u00e8\u00e0IqcE\u009a8\u001b/\u0011\u00f3\u0000\u00b9e\u00b9\u00d1\u0002\u00cd(Ym=\u0099\u0010\u00e8\u00e5\u009a\u0082\u0012Z*\u00a2@4i`\u001agS\u00ddEQ\u00f5\u00d5\u00d8\u00f1B\u0091R\u00da\u009d\u00f8\u009eQ\u00bd\u00bb\u00ac\u00e9\u00d1\u000b\u0099$\u00d0|\u00d1\u00d9p\u00fa\u00c6\u00ba\u00eed\u00db\u00f9\u0017w\u009d\u0014`<1\u00f6\u00ef\u00ae\u00b5\u00c7+n\u00fc\u008c\u00f7e\u0099\u0099\u001b\u00b7\u00e4\f_R\u007f\u00da\u00a6Sn\u00d8\u00b8\u0089\u0010|Y\u00aa+\u00e2#?f\u0013\u008fr4\u00f6\u00dc\u00f8DQL\u00f3\u00bb \u00b6p~\u00f7\u00bb]\u00bc\u00e4\u00bc\u00f6t\u001e\u00a7\n\u00fc\u00a8]\u00ef\u0094\u00c21\u008eo|{}\u00deI\u0003\u00b4@\u00ec\u00df\u00ac\u00994\t.\u0010\t/\u00c4r\u00dcn\u0082\u00e0\u0099\u00efgF\u00ff\u00d0SK\u000e\u00c1\u00f1\u0094\u0017\u00b8\u00ab\u00be\u00c5 \u0087f\u009b\u0085e\u001f|\u00e4y\u00f0\u00b2\u00cf\u0006k[L0\u0091\u00abc\u0006\u00c3\u00d3\\\u00f0\u0018N\u00d3)s\u00faN;\u001e\u0085\u0084\u0096a~)\u009c%\u00ae\u00a7\u001c\u00d9\u0011a\u00f2\u00ecp\u00a9\u0006\u00a6C`I\u0019Q?\u0003\u00c3qb\u0093wZ\u00a5/\u0092\u00cf\u00d9\b\u0082\u00a0G\u00cf;`\u00dfk\u00ce\b\u0012>z\u00e8\u00ab6'\u00ca\u00cb|&\u00f2\t\u00ba\u0083\u001f8\u00ba\u00c6\u00c5\u00c7\u000eQD\u00d2\u00de\n\u0099\u00ba\u008a\u00f9\u00a4\u008b\u00e99");
        var6_6 = var4_5.length();
        var1_7 = 40;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = N8.C("\u00cc\u00a5\\y\u0088\u00df\u00d5eo/\u0081\u0013m!g\u00dd\u00e0u\u00d1\u00ab:\n|\u00e1+\u0085\u0080\u000e{X\u008d\u001c\u00be7\u001e\u00f1.7O\u00a4\u00d2\u001c\u00f9\u0006:\u0085\u0097X\u0094x\u00ef\u009a\u0080\u00c2\u00dc|\u000e_t\u00c5p\u00d3\u0092/\u00c1|dBGLn\u00ce\u00a5\u0088$\u00f8\u00e1X\u0090\u00e5l+\u00dd\u00f0\u0092\u00dd\u008b\u00a7\u001b4~E\u009a\u00c3\u00d7\u0096\u00a1\u0016\u00ea\u00f6\u00d2~'\u008e\u00d0\u00cf0\u009a\u00b3%g\u0087\u009d\u00dd\u0015!NKa\u00d4\u0089");
                var6_6 = var4_5.length();
                var1_7 = 80;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = Tu.a(var2_1.doFinal(v6.getBytes(pe.C("dWu>^w)\f\u0010%")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = Tu.a(var2_1.doFinal(v6.getBytes(pe.C("dWu>^w)\f\u0010%")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        Tu.f = var7_3;
                        Tu.g = new String[65];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
    }

    public static /* synthetic */ double O(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        double d2 = (Double)this_[2];
        l2 = c ^ l2;
        double d3 = d2;
        ye.a("F", (Object)((Object)tu), (double)d3, (long)-5887109643811754421L, (long)l2);
        return d3;
    }

    public static /* synthetic */ void e(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        Path path = (Path)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x6AC946E23345L;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = path;
        ye.a("\u00aa", (Object)((Object)tu), (Object)arrobject, (long)-2331503421195757222L, (long)l2);
    }

    public static /* synthetic */ Stage v(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (Stage)ye.a("Z", (long)7832595434547744419L, (long)l2);
    }

    public static /* synthetic */ int i(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        int n2 = (Integer)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        int n3 = n2;
        ye.a("F", (Object)((Object)tu), (int)n3, (long)-4014321193531002321L, (long)l2);
        return n3;
    }

    public static /* synthetic */ TextField V(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (TextField)ye.a("\u00c3", (Object)((Object)tu), (long)7300736476086517499L, (long)l2);
    }

    public static /* synthetic */ int d(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (int)ye.a("\u00c3", (Object)((Object)tu), (long)1663639793747243876L, (long)l2);
    }

    public static /* synthetic */ No y(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        No no = (No)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        No no2 = no;
        ye.a("F", (Object)((Object)tu), (No)no2, (long)-8524206359904283025L, (long)l2);
        return no2;
    }

    public static /* synthetic */ Stage o(Object[] this_) {
        long l2 = (Long)this_[0];
        Stage stage = (Stage)this_[1];
        l2 = c ^ l2;
        Stage stage2 = stage;
        ye.a("\u00ed", (Stage)stage2, (long)-578186369419831832L, (long)l2);
        return stage2;
    }

    public static /* synthetic */ ProgressBar W(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        ProgressBar progressBar = (ProgressBar)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        ProgressBar progressBar2 = progressBar;
        ye.a("F", (Object)((Object)tu), (ProgressBar)progressBar2, (long)-4581957216706506538L, (long)l2);
        return progressBar2;
    }

    public static /* synthetic */ long X(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        long l3 = (Long)this_[2];
        l3 = c ^ l3;
        long l4 = l2;
        ye.a("F", (Object)((Object)tu), (long)l4, (long)8043738097694967145L, (long)l3);
        return l4;
    }

    public static /* synthetic */ long y(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (long)ye.a("\u00c3", (Object)((Object)tu), (long)-4675268508675385898L, (long)l2);
    }

    public static /* synthetic */ int Y(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (int)ye.a("\u00c3", (Object)((Object)tu), (long)7580067002080821976L, (long)l2);
    }

    @FXML
    private /* synthetic */ void n() {
        long l2 = c ^ 0x2A465CF058B1L;
        ye.a("G", (long)-1485352876792836584L, (long)l2);
        ye.a("G", (int)0, (long)-1503494862154859283L, (long)l2);
    }

    public static /* synthetic */ No A(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (No)((Object)ye.a("\u00c3", (Object)((Object)tu), (long)1094836969163067629L, (long)l2));
    }

    public static /* synthetic */ int n(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        ye.a("F", (Object)((Object)tu), (int)0, (long)1666677598952567635L, (long)l2);
        return 0;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Tu.a(this222, l2);
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void o(Object[] this) {
        block14: {
            block12: {
                block13: {
                    var1_1 = (Long)this[0];
                    var1_1 = Tu.c ^ var1_1;
                    var3_2 = var1_1 ^ 74185454140904L;
                    var5_4 = ye.a("G", (long)-9118541933093786601L, (long)var1_1);
                    v0 = new Object[1];
                    v0[0] = var3_2;
                    v1 = var3_3 = (pI)ye.a("G", (Object)v0, (long)-9196527987519074386L, (long)var1_1);
                    try {
                        v2 = (pI)ye.a("Z", (long)-9151646181281319019L, (long)var1_1);
                        if (var5_4 == null) break block12;
                        if (v1 != v2) break block13;
                        ** GOTO lbl27
                    }
                    catch (IllegalStateException v3) {
                        try {
                            throw (Throwable)ye.a("G", (Object)v3, (long)-9116398741026352411L, (long)var1_1);
lbl27:
                            // 1 sources

                            (Process)ye.a("j", (Object)((Runtime)ye.a("G", (long)-9179943565909136068L, (long)var1_1)), (Object)((String)Tu.a("c", (int)4437, (long)(8801765223814589001L ^ var1_1))), (long)-9206340768535452383L, (long)var1_1);
                            return;
                        }
                        catch (IllegalStateException v4) {
                            throw (Throwable)ye.a("G", (Object)v4, (long)-9116398741026352411L, (long)var1_1);
                        }
                    }
                }
                v1 = var3_3;
                v2 = (pI)ye.a("Z", (long)-9174609543221955459L, (long)var1_1);
            }
            try {
                try {
                    if (var1_1 < 0L || var5_4 == null) break block14;
                    if (v1 != v2) {
                        v1 = var3_3;
                    }
                    ** GOTO lbl54
                }
                catch (IllegalStateException v5) {
                    throw (Throwable)ye.a("G", (Object)v5, (long)-9116398741026352411L, (long)var1_1);
                }
                v2 = (pI)ye.a("Z", (long)-9220949522238022221L, (long)var1_1);
            }
            catch (IllegalStateException v6) {
                throw (Throwable)ye.a("G", (Object)v6, (long)-9116398741026352411L, (long)var1_1);
            }
        }
        try {
            if (v1 != v2) return;
lbl54:
            // 2 sources

            (Process)ye.a("j", (Object)((Runtime)ye.a("G", (long)-9179943565909136068L, (long)var1_1)), (Object)((String)Tu.a("c", (int)21030, (long)(1379600743461497108L ^ var1_1))), (long)-9206340768535452383L, (long)var1_1);
            return;
        }
        catch (IllegalStateException v7) {
            throw (Throwable)ye.a("G", (Object)v7, (long)-9116398741026352411L, (long)var1_1);
        }
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ String V(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    public static /* synthetic */ Path A(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (Path)((Object)ye.a("Z", (long)-7786811381055366165L, (long)l2));
    }

    public static /* synthetic */ Timer m(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (Timer)((Object)ye.a("\u00c3", (Object)((Object)tu), (long)-4203290323947288754L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void Y(Object[] this) {
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
    @FXML
    private /* synthetic */ void m() {
        block9: {
            Stage stage;
            long l2;
            block8: {
                CallSite callSite;
                block6: {
                    block7: {
                        l2 = c ^ 0x54FDC505BBBDL;
                        callSite = ye.a("G", (long)611369822675821855L, (long)l2);
                        try {
                            stage = (Stage)ye.a("Z", (long)711179872128756233L, (long)l2);
                            if (callSite == null) break block6;
                            if (stage == null) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            try {
                                throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)609217765789850605L, (long)l2));
                            }
                            catch (IllegalStateException illegalStateException2) {
                                throw (Throwable)((Object)ye.a("G", (Object)illegalStateException2, (long)609217765789850605L, (long)l2));
                            }
                        }
                        ye.a("j", (Object)((Stage)ye.a("Z", (long)711179872128756233L, (long)l2)), (boolean)true, (long)592342699566395204L, (long)l2);
                    }
                    stage = (Stage)ye.a("Z", (long)713191182524673012L, (long)l2);
                }
                try {
                    if (callSite == null) break block8;
                    if (stage == null) break block9;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)609217765789850605L, (long)l2));
                }
                stage = (Stage)ye.a("Z", (long)713191182524673012L, (long)l2);
            }
            ye.a("j", (Object)stage, (boolean)true, (long)592342699566395204L, (long)l2);
        }
    }

    public static /* synthetic */ String f(Object[] this_) {
        String string = (String)this_[0];
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        String string2 = string;
        ye.a("\u00ed", string2, (long)7766313643807437351L, (long)l2);
        return string2;
    }

    public static /* synthetic */ ChoiceBox z(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (ChoiceBox)ye.a("\u00c3", (Object)((Object)tu), (long)-5346836082065025526L, (long)l2);
    }

    public static /* synthetic */ String[] V(Object[] this_) {
        int n2 = (Integer)this_[0];
        int n3 = (Integer)this_[1];
        int n4 = (Integer)this_[2];
        Tu tu = (Tu)((Object)this_[3]);
        long l2 = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ c;
        return (String[])ye.a("\u00c3", (Object)((Object)tu), (long)-4495546301548690887L, (long)l2);
    }

    private static /* synthetic */ void E(TitledPane this_) {
        long l2 = c ^ 0x60F90CBE2F6DL;
        ye.a("j", (Object)this_, (boolean)false, (long)-7142246675000315321L, (long)l2);
    }

    public static /* synthetic */ int b(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (int)ye.a("\u00c3", (Object)((Object)tu), (long)-1406675688949475809L, (long)l2);
    }

    public static /* synthetic */ boolean H(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (boolean)ye.a("\u00c3", (Object)((Object)tu), (long)-1606620561427520329L, (long)l2);
    }

    public static /* synthetic */ void J(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        boolean bl = (Boolean)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x37234E84D1B1L;
        Object[] arrobject = new Object[2];
        arrobject[1] = bl;
        arrobject[0] = l3;
        ye.a("\u00aa", (Object)((Object)tu), (Object)arrobject, (long)2891474340272540884L, (long)l2);
    }

    public static /* synthetic */ TextField A(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (TextField)ye.a("\u00c3", (Object)((Object)tu), (long)-5026234608837581941L, (long)l2);
    }

    public static /* synthetic */ NB h(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (NB)((Object)ye.a("\u00c3", (Object)((Object)tu), (long)4860023532001384832L, (long)l2));
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    public static /* synthetic */ Stage J(Object[] this_) {
        long l2 = (Long)this_[0];
        Stage stage = (Stage)this_[1];
        l2 = c ^ l2;
        Stage stage2 = stage;
        ye.a("\u00ed", (Stage)stage2, (long)-2204279619506223698L, (long)l2);
        return stage2;
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

    public static /* synthetic */ int r(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        Tu tu2 = tu;
        CallSite callSite = ye.a("\u00c3", (Object)((Object)tu2), (long)3691964858781996878L, (long)l2);
        ye.a("F", (Object)((Object)tu2), (int)(callSite + true), (long)3691964858781996878L, (long)l2);
        return (int)callSite;
    }

    @FXML
    private /* synthetic */ void r() {
        long l2 = c ^ 0x667365857C5BL;
        ye.a("j", (Object)((Object)new pu(this)), (long)-3480896486594165837L, (long)l2);
    }

    @FXML
    private /* synthetic */ void B() {
        long l2 = c ^ 0x303A5A8C5F17L;
        ye.a("j", (Object)((Object)new TA(this)), (long)-1369928404942495489L, (long)l2);
    }

    public static /* synthetic */ Path e(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (Path)((Object)ye.a("Z", (long)3656027514988821176L, (long)l2));
    }

    public static /* synthetic */ Button b(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (Button)ye.a("\u00c3", (Object)((Object)tu), (long)-7010337463449837714L, (long)l2);
    }

    public static /* synthetic */ NB Z(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        NB nB = (NB)this_[2];
        l2 = c ^ l2;
        NB nB2 = nB;
        ye.a("F", (Object)((Object)tu), (NB)nB2, (long)7334425608507588411L, (long)l2);
        return nB2;
    }

    @FXML
    private /* synthetic */ void N() {
        long l2 = c ^ 0x793EDDA93741L;
        ye.a("j", (Object)((Object)new X5(this)), (long)-8886938679284987735L, (long)l2);
    }

    public static /* synthetic */ double W(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (double)ye.a("\u00c3", (Object)((Object)tu), (long)-6141916500847433020L, (long)l2);
    }

    public static /* synthetic */ Stage H(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (Stage)ye.a("Z", (long)566005889828463388L, (long)l2);
    }

    public static /* synthetic */ void x(Object[] this_) {
        boolean bl;
        Button button;
        long l2;
        block10: {
            block11: {
                boolean bl2;
                PasswordField passwordField;
                CallSite callSite;
                boolean bl3;
                Tu tu;
                block8: {
                    block9: {
                        boolean bl4;
                        TextField textField;
                        block6: {
                            block7: {
                                tu = (Tu)((Object)this_[0]);
                                l2 = (Long)this_[1];
                                bl3 = (Boolean)this_[2];
                                l2 = c ^ l2;
                                callSite = ye.a("G", (long)-8426682402456934803L, (long)l2);
                                try {
                                    textField = (TextField)ye.a("\u00c3", (Object)((Object)tu), (long)-8436573629838110399L, (long)l2);
                                    bl4 = bl3;
                                    if (callSite == null) break block6;
                                    if (bl4) break block7;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)-8429035592922539873L, (long)l2));
                                }
                                bl4 = true;
                                break block6;
                            }
                            bl4 = false;
                        }
                        try {
                            ye.a("j", (Object)textField, (boolean)bl4, (long)-8400876801381568667L, (long)l2);
                            passwordField = (PasswordField)ye.a("\u00c3", (Object)((Object)tu), (long)-8491399016340252717L, (long)l2);
                            bl2 = bl3;
                            if (callSite == null) break block8;
                            if (bl2) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)-8429035592922539873L, (long)l2));
                        }
                        bl2 = true;
                        break block8;
                    }
                    bl2 = false;
                }
                try {
                    ye.a("j", (Object)passwordField, (boolean)bl2, (long)-8498777549216715459L, (long)l2);
                    button = (Button)ye.a("\u00c3", (Object)((Object)tu), (long)-8523173675042796399L, (long)l2);
                    bl = bl3;
                    if (callSite == null) break block10;
                    if (bl) break block11;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)-8429035592922539873L, (long)l2));
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        ye.a("j", (Object)button, (boolean)bl, (long)-8534646519566752863L, (long)l2);
    }

    public static /* synthetic */ String c(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x867A8C02213L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (String)((Object)ye.a("G", (Object)arrobject, (long)-2139778463479380172L, (long)l2));
    }

    public static /* synthetic */ double F(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        double d2 = (Double)this_[2];
        l2 = c ^ l2;
        double d3 = d2;
        ye.a("F", (Object)((Object)tu), (double)d3, (long)4924273447965064741L, (long)l2);
        return d3;
    }

    public static /* synthetic */ double Z(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (double)ye.a("\u00c3", (Object)((Object)tu), (long)4650126001408211707L, (long)l2);
    }

    public static /* synthetic */ Stage X(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (Stage)ye.a("Z", (long)-4000682698644280403L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ void initialize(URL this, ResourceBundle this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CATCHBLOCK], 9[CATCHBLOCK]], but top level block is 5[TRYBLOCK]
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

    public static /* synthetic */ Scene K(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (Scene)ye.a("\u00c3", (Object)((Object)tu), (long)8545270130502804419L, (long)l2);
    }

    public /* synthetic */ Tu() {
        long l2 = c ^ 0x7668C374B660L;
        String[] arrstring = new String[8];
        arrstring[0] = (String)((Object)Tu.a("c", (int)25443, (long)(0x7703D893EE881CB0L ^ l2)));
        arrstring[1] = (String)((Object)Tu.a("c", (int)16171, (long)(0x6D9DBA9E3EA1C0CBL ^ l2)));
        arrstring[2] = (String)((Object)Tu.a("c", (int)14212, (long)(0x34C7D4427D9BC853L ^ l2)));
        arrstring[3] = (String)((Object)Tu.a("c", (int)10002, (long)(0x28BDAE955B45D8DEL ^ l2)));
        arrstring[4] = (String)((Object)Tu.a("c", (int)19394, (long)(0x422F5EC979DAB42AL ^ l2)));
        arrstring[5] = (String)((Object)Tu.a("c", (int)11453, (long)(0x6E8363F65C6FD354L ^ l2)));
        arrstring[6] = (String)((Object)Tu.a("c", (int)15321, (long)(0x332568DA6EE74427L ^ l2)));
        arrstring[7] = (String)((Object)Tu.a("c", (int)27680, (long)(0x1A600BD8E51093C2L ^ l2)));
        this.I = arrstring;
        String[] arrstring2 = new String[11];
        arrstring2[0] = (String)((Object)Tu.a("c", (int)3638, (long)(0x29F0C23EC64C71CFL ^ l2)));
        arrstring2[1] = (String)((Object)Tu.a("c", (int)32277, (long)(0x6D0FE630334381C3L ^ l2)));
        arrstring2[2] = (String)((Object)Tu.a("c", (int)29691, (long)(0x5A68B07D92FA0C2AL ^ l2)));
        arrstring2[3] = (String)((Object)Tu.a("c", (int)4078, (long)(0x481A3896F1BDF03BL ^ l2)));
        arrstring2[4] = (String)((Object)Tu.a("c", (int)10426, (long)(0x200728128C5576AL ^ l2)));
        arrstring2[5] = (String)((Object)Tu.a("c", (int)28810, (long)(0x696CDF700D360F61L ^ l2)));
        arrstring2[6] = (String)((Object)Tu.a("c", (int)13912, (long)(0x1D98C7B6C697C997L ^ l2)));
        arrstring2[7] = (String)((Object)Tu.a("c", (int)29584, (long)(0x4691C7C548350C76L ^ l2)));
        arrstring2[8] = (String)((Object)Tu.a("c", (int)15989, (long)(0x7BA2DE4F04AFC188L ^ l2)));
        arrstring2[9] = (String)((Object)Tu.a("c", (int)5053, (long)(0xC1853F45F8F6C57L ^ l2)));
        arrstring2[10] = (String)((Object)Tu.a("c", (int)24564, (long)(0x61BED542346AA006L ^ l2)));
        this.X = arrstring2;
        Tu tu = this;
        tu.n = 0L;
        tu.o = 0.0;
        Tu tu2 = this;
        tu2.b = new Timer();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private /* synthetic */ Path O(Object[] object2222) {
        block8: {
            l2 = (Long)object2222[0];
            l2 = Tu.c ^ l2;
            l3 = l2 ^ 20495327690583L;
            object2222 = ye.a("G", (long)-481238055307209679L, (long)l2);
            v0 = new Object[1];
            v0[0] = l3;
            v1 = path2 = (Path)ye.a("G", (Object)v0, (long)-543003401590128088L, (long)l2);
            try {
                if (object2222 == null) return v1;
                if (ye.a("G", (Object)v1, (Object)new LinkOption[0], (long)-575626938591098136L, (long)l2) != false) break block8;
                {
                    v2 = path2;
                    ** GOTO lbl34
                }
            }
            catch (IOException v3) {
                try {
                    throw (Throwable)ye.a("G", (Object)v3, (long)-479025055251223869L, (long)l2);
                }
                catch (IllegalStateException v4) {
                    throw (Throwable)ye.a("G", (Object)v4, (long)-479025055251223869L, (long)l2);
                }
lbl34:
                // 2 sources

                (Path)ye.a("G", (Object)v2, (Object)new FileAttribute[0], (long)-573974220946834916L, (long)l2);
            }
            catch (IOException object2222) {
                ye.a("G", (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, y(java.nio.file.Path ), ()V)((Tu)this, (Path)path2), (long)-565992966208908193L, (long)l2);
                v5 = new Object[1];
                v5[0] = path2;
                throw new RuntimeException((String)ye.a("G", (String)Tu.a("c", (int)17029, (long)(1936284205859291572L ^ l2)), (Object)v5, (long)-553444661160034253L, (long)l2), object2222);
            }
        }
        v1 = path2;
        return v1;
    }

    public static /* synthetic */ Socket f(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        Socket socket = (Socket)this_[2];
        l2 = c ^ l2;
        Socket socket2 = socket;
        ye.a("F", (Object)((Object)tu), (Socket)socket2, (long)2136300685295173490L, (long)l2);
        return socket2;
    }

    public static /* synthetic */ String R(Object[] this_) {
        long l2 = (Long)this_[0];
        String string = (String)this_[1];
        l2 = c ^ l2;
        String string2 = string;
        ye.a("\u00ed", string2, (long)650495238176214281L, (long)l2);
        return string2;
    }

    public static /* synthetic */ String D(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        return (String)((Object)ye.a("Z", (long)1911227315252364134L, (long)l2));
    }

    public static /* synthetic */ void H(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        ye.a("\u00aa", (Object)((Object)tu), (long)1152581314971957695L, (long)l2);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x7944;
        if (g[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])a.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u0014\u0016Z2v,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(pe.C("qxG"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    a.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(\u001b[$0\u0016~"), exception);
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
            byte[] arrby2 = f[n2].getBytes(pe.C("dWu>^w)\f\u0010%"));
            Tu.g[n2] = Tu.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return g[n2];
    }

    public static /* synthetic */ PasswordField r(Object[] this_) {
        long l2 = (Long)this_[0];
        Tu tu = (Tu)((Object)this_[1]);
        l2 = c ^ l2;
        return (PasswordField)ye.a("\u00c3", (Object)((Object)tu), (long)-8904411315881502314L, (long)l2);
    }

    private static /* synthetic */ void j(Object[] this_) {
        long l2 = (Long)this_[0];
        String string = (String)this_[1];
        String string2 = (String)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x129568C203A3L;
        ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)602014422196769108L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)Tu.a("c", (int)18959, (long)(0x2C500DBDEA53BA4CL ^ l2)))), (Object)string, (long)614968529840785471L, (long)l2))), (Object)N8.C(" "), (long)614968529840785471L, (long)l2))), (Object)string2, (long)614968529840785471L, (long)l2))), (long)821864285403803600L, (long)l2))), (long)612344213862067062L, (long)l2);
        Object[] arrobject = new Object[5];
        arrobject[4] = string2;
        arrobject[3] = string;
        arrobject[2] = (String)((Object)Tu.a("c", (int)32151, (long)(0x58BD64C0EC770DCAL ^ l2)));
        arrobject[1] = l3;
        arrobject[0] = (Alert.AlertType)ye.a("Z", (long)614930126063109140L, (long)l2);
        ye.a("G", (Object)arrobject, (long)619185765859905175L, (long)l2);
    }

    public static /* synthetic */ Socket M(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (Socket)((Object)ye.a("\u00c3", (Object)((Object)tu), (long)-1648068661659317257L, (long)l2));
    }

    private static /* synthetic */ void f(Object[] this_) {
        Alert.AlertType alertType = (Alert.AlertType)this_[0];
        long l2 = (Long)this_[1];
        String string = (String)this_[2];
        String string2 = (String)this_[3];
        String string3 = (String)this_[4];
        l2 = c ^ l2;
        alertType = new Alert(alertType);
        ye.a("j", (Object)alertType, (Object)string, (long)-5048433396016006075L, (long)l2);
        ye.a("j", (Object)alertType, (Object)string2, (long)-4905718177800873787L, (long)l2);
        ye.a("j", (Object)alertType, (Object)string3, (long)-5118975228297049432L, (long)l2);
        string = (Stage)ye.a("j", (Object)((Scene)ye.a("j", (Object)((DialogPane)ye.a("j", (Object)alertType, (long)-5111338771751164132L, (long)l2)), (long)-5162922842314218313L, (long)l2)), (long)-5090114695828877709L, (long)l2);
        ye.a("j", string, (boolean)true, (long)-5046837359122251503L, (long)l2);
        ye.a("j", (Object)((ObservableList)ye.a("j", string, (long)-5089463853157036440L, (long)l2)), (Object)new Image((String)((Object)ye.a("j", (Object)((URL)((Object)ye.a("j", Tu.class, (Object)((String)((Object)Tu.a("c", (int)22297, (long)(0x367229FB9A6B143AL ^ l2)))), (long)-5088165041988291911L, (long)l2))), (long)-5176219944258913960L, (long)l2))), (long)-4922263996750354086L, (long)l2);
        Optional cfr_ignored_0 = (Optional)((Object)ye.a("j", (Object)alertType, (long)-5141368578175562807L, (long)l2));
    }

    public static /* synthetic */ void l(Object[] this_) {
        String string = (String)this_[0];
        String string2 = (String)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x23DAFD6A613L;
        Object[] arrobject = new Object[3];
        arrobject[2] = string2;
        arrobject[1] = string;
        arrobject[0] = l3;
        ye.a("G", (Object)arrobject, (long)2857871058639243530L, (long)l2);
    }

    public static /* synthetic */ void b(Object[] this_) {
        Application.launch((String[])((String[])this_[0]));
    }

    public final /* synthetic */ void start(Stage object) {
        long l2 = c ^ 0xD141AD094A8L;
        long l3 = l2 ^ 0x2641DFDAA6A0L;
        long l4 = l2 ^ 0x29F560427F42L;
        long l5 = l2 ^ 0x18A49080E12AL;
        long l6 = l2 ^ 0x4500C13EF9BAL;
        long l7 = l2 ^ 0xD25E033E6B0L;
        Stage stage = object;
        ye.a("\u00ed", (Stage)stage, (long)2795547598586463516L, (long)l2);
        ye.a("j", (Object)stage, (Object)((StageStyle)ye.a("Z", (long)2788515534232716542L, (long)l2)), (long)2721665791326124884L, (long)l2);
        object = (Parent)ye.a("G", (Object)((URL)((Object)ye.a("G", (Object)((URL)((Object)ye.a("j", Tu.class, (Object)((String)((Object)Tu.a("c", (int)30368, (long)(0x70EA3D15FA0DABBAL ^ l2)))), (long)2840927594434702519L, (long)l2))), (Object)((String)((Object)Tu.a("c", (int)2493, (long)(0x66F56C3F76375480L ^ l2)))), (long)2767507560899948755L, (long)l2))), (long)2817049990563681633L, (long)l2);
        ye.a("F", (Object)((Object)this), (Scene)new Scene((Parent)object), (long)2874073133741186602L, (long)l2);
        ye.a("j", (Object)((ObservableList)ye.a("j", (Object)((Scene)ye.a("\u00c3", (Object)((Object)this), (long)2874073133741186602L, (long)l2)), (long)2721084955771047934L, (long)l2)), (Object)((String)((Object)ye.a("j", (Object)((URL)((Object)ye.a("G", (Object)((URL)((Object)ye.a("j", Tu.class, (Object)((String)((Object)Tu.a("c", (int)18237, (long)(0x474B0E7D359E1A2CL ^ l2)))), (long)2840927594434702519L, (long)l2))), (Object)((String)((Object)Tu.a("c", (int)30678, (long)(0x4EBD9F0C18A62ADEL ^ l2)))), (long)2767507560899948755L, (long)l2))), (long)2780886143324221349L, (long)l2))), (long)2719803344307140436L, (long)l2);
        ye.a("j", (Object)((ObservableList)ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (long)2832944301178802278L, (long)l2)), (Object)new Image((InputStream)((Object)ye.a("G", (Object)((InputStream)((Object)ye.a("j", Tu.class, (Object)((String)((Object)Tu.a("c", (int)3484, (long)(0x2EF66D5A373B50A0L ^ l2)))), (long)2824755375146144231L, (long)l2))), (Object)((String)((Object)Tu.a("c", (int)17219, (long)(0x5448A31C03129E7DL ^ l2)))), (long)2767507560899948755L, (long)l2))), (long)2719803344307140436L, (long)l2);
        Object[] arrobject = new Object[1];
        arrobject[0] = l7;
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (Object)((String)((Object)ye.a("G", (Object)arrobject, (long)2805460617655485335L, (long)l2))), (long)2743384952053760914L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (Object)((Scene)ye.a("\u00c3", (Object)((Object)this), (long)2874073133741186602L, (long)l2)), (long)2719173783716442300L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (boolean)false, (long)2667796832805599754L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (long)2765226005868828046L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (Object)((EventHandler)windowEvent -> {
            long l2 = c ^ 0x5236FF14070DL;
            ye.a("\u00aa", (Object)((Object)this), (long)-5436723696018308403L, (long)l2);
        }), (long)2781254776355265464L, (long)l2);
        ye.a("j", (Object)((Scene)ye.a("\u00c3", (Object)((Object)this), (long)2874073133741186602L, (long)l2)), (Object)((EventHandler)mouseEvent -> {
            long l2 = c ^ 0x721C229EA442L;
            ye.a("F", (Object)((Object)this), (double)ye.a("j", (Object)mouseEvent, (long)1656312617104457892L, (long)l2), (long)1652136582743862430L, (long)l2);
            ye.a("F", (Object)((Object)this), (double)ye.a("j", (Object)mouseEvent, (long)1729236945486046671L, (long)l2), (long)1599865628375078452L, (long)l2);
        }), (long)2668809282927874357L, (long)l2);
        ye.a("j", (Object)((Scene)ye.a("\u00c3", (Object)((Object)this), (long)2874073133741186602L, (long)l2)), (Object)((EventHandler)this -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 15[CATCHBLOCK]
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
        }), (long)2734955222781531707L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (long)2771006881977876073L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (boolean)true, (long)2880118393590095647L, (long)l2);
        ye.a("j", (Object)((Stage)ye.a("Z", (long)2795547598586463516L, (long)l2)), (boolean)false, (long)2880118393590095647L, (long)l2);
        try {
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l6;
            object = ye.a("G", (Object)arrobject2, (long)2874632207620745922L, (long)l2);
            Object[] arrobject3 = new Object[4];
            arrobject3[3] = object;
            arrobject3[2] = object;
            arrobject3[1] = l5;
            arrobject3[0] = object;
            Object object2 = object;
            Object[] arrobject4 = new Object[4];
            arrobject4[3] = object2;
            arrobject4[2] = object2;
            arrobject4[1] = l4;
            arrobject4[0] = ye.a("G", (Object)arrobject3, (long)2671544627022783578L, (long)l2);
            CallSite callSite = ye.a("G", (Object)arrobject4, (long)2673674732364741456L, (long)l2);
            try {
                if (ye.a("G", (Object)object, (Object)callSite, (long)2880036793920406792L, (long)l2) == false) {
                    throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)Tu.a("c", (int)18021, (long)(0x69E8CB33DD209B72L ^ l2)))), (Object)((String)((Object)ye.a("G", (Object)callSite, (long)2757425615370893982L, (long)l2))), (long)2737264021219927371L, (long)l2))), (Object)((String)((Object)Tu.a("c", (int)10391, (long)(0x3145909F20F4F585L ^ l2)))), (long)2737264021219927371L, (long)l2))), (Object)((String)((Object)ye.a("G", (Object)object, (long)2757425615370893982L, (long)l2))), (long)2737264021219927371L, (long)l2))), (long)2743713309485417124L, (long)l2)));
                }
            }
            catch (Throwable throwable) {
                throw (Throwable)((Object)ye.a("G", (Object)throwable, (long)2837612725592913144L, (long)l2));
            }
            return;
        }
        catch (Throwable throwable) {
            object = throwable;
            ye.a("j", (Object)throwable, (long)2780023358940966726L, (long)l2);
            Object object3 = new ByteArrayOutputStream();
            ye.a("j", (Object)object, (Object)new PrintStream((OutputStream)object3), (long)2732164061055134810L, (long)l2);
            object3 = new String((byte[])ye.a("j", (Object)object3, (long)2741429229804185871L, (long)l2), (Charset)((Object)ye.a("Z", (long)2816837758661576113L, (long)l2)));
            Object[] arrobject5 = new Object[3];
            arrobject5[2] = (String)((Object)ye.a("j", (String)((Object)Tu.a("c", (int)10153, (long)(0x11973E58EB557A90L ^ l2))), (Object)((String)((Object)ye.a("G", (Object)object3, (long)2726173122385664958L, (long)l2))), (long)2666261484953758210L, (long)l2));
            arrobject5[1] = (String)((Object)Tu.a("c", (int)27388, (long)(0x61A84D77DE4937EAL ^ l2)));
            arrobject5[0] = l3;
            ye.a("G", (Object)arrobject5, (long)2817589712762685881L, (long)l2);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ String v(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    public static /* synthetic */ pV M(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        long l2 = (Long)this_[1];
        l2 = c ^ l2;
        return (pV)((Object)ye.a("\u00c3", (Object)((Object)tu), (long)5512516339603100888L, (long)l2));
    }

    private static /* synthetic */ void g(Object[] this_) {
        long l2 = (Long)this_[0];
        String string = (String)this_[1];
        String string2 = (String)this_[2];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x1203FC8238AEL;
        ye.a("j", (Object)((PrintStream)((Object)ye.a("Z", (long)3699646053758495321L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)Tu.a("c", (int)19184, (long)(0x47B583BC8AB581B1L ^ l2)))), (Object)string, (long)3712600002488726322L, (long)l2))), (Object)pe.C("4"), (long)3712600002488726322L, (long)l2))), (Object)string2, (long)3712600002488726322L, (long)l2))), (long)3488840142659179741L, (long)l2))), (long)3707160992040587387L, (long)l2);
        Object[] arrobject = new Object[5];
        arrobject[4] = string2;
        arrobject[3] = string;
        arrobject[2] = (String)((Object)Tu.a("c", (int)20273, (long)(0x6F4E687BC8A3044BL ^ l2)));
        arrobject[1] = l3;
        arrobject[0] = (Alert.AlertType)ye.a("Z", (long)3548237551060674141L, (long)l2);
        ye.a("G", (Object)arrobject, (long)3718507346793526682L, (long)l2);
    }

    private /* synthetic */ void M(Object[] arrobject2) {
        boolean bl;
        Button button;
        long l2;
        block10: {
            block11: {
                boolean bl2;
                Button button2;
                CallSite callSite;
                block8: {
                    block9: {
                        boolean bl3;
                        ChoiceBox choiceBox;
                        block6: {
                            block7: {
                                l2 = (Long)arrobject2[0];
                                boolean arrobject2 = (Boolean)arrobject2[1];
                                l2 = c ^ l2;
                                callSite = ye.a("G", (long)5321293159640868026L, (long)l2);
                                try {
                                    choiceBox = (ChoiceBox)ye.a("\u00c3", (Object)((Object)this), (long)5455275866310846579L, (long)l2);
                                    bl3 = arrobject2;
                                    if (callSite == null) break block6;
                                    if (bl3) break block7;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)5319140553271712328L, (long)l2));
                                }
                                bl3 = true;
                                break block6;
                            }
                            bl3 = false;
                        }
                        try {
                            ye.a("j", (Object)choiceBox, (boolean)bl3, (long)5316977501247711134L, (long)l2);
                            button2 = (Button)ye.a("\u00c3", (Object)((Object)this), (long)5435898166349436625L, (long)l2);
                            bl2 = arrobject2;
                            if (callSite == null) break block8;
                            if (bl2) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)5319140553271712328L, (long)l2));
                        }
                        bl2 = true;
                        break block8;
                    }
                    bl2 = false;
                }
                try {
                    ye.a("j", (Object)button2, (boolean)bl2, (long)5429571874485690742L, (long)l2);
                    button = (Button)ye.a("\u00c3", (Object)((Object)this), (long)5306034168040716166L, (long)l2);
                    bl = arrobject2;
                    if (callSite == null) break block10;
                    if (bl) break block11;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (Throwable)((Object)ye.a("G", (Object)illegalStateException, (long)5319140553271712328L, (long)l2));
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        ye.a("j", (Object)button, (boolean)bl, (long)5429571874485690742L, (long)l2);
    }

    @FXML
    private /* synthetic */ void b() {
        long l2 = c ^ 0x1273B51F75B3L;
        ye.a("j", (Object)((Object)new vX(this)), (long)-4154241806302950821L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void t(Object[] this) {
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

    public static /* synthetic */ Scene O(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        Scene scene = (Scene)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        Scene scene2 = scene;
        ye.a("F", (Object)((Object)tu), (Scene)scene2, (long)-1692063046526845487L, (long)l2);
        return scene2;
    }

    public static /* synthetic */ boolean c(Object[] this_) {
        Tu tu = (Tu)((Object)this_[0]);
        boolean bl = (Boolean)this_[1];
        long l2 = (Long)this_[2];
        l2 = c ^ l2;
        boolean bl2 = bl;
        ye.a("F", (Object)((Object)tu), (boolean)bl2, (long)3346225881949594483L, (long)l2);
        return bl2;
    }
}

