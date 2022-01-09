/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.animation.KeyFrame
 *  javafx.animation.KeyValue
 *  javafx.animation.Timeline
 *  javafx.beans.property.DoubleProperty
 *  javafx.beans.value.WritableValue
 *  javafx.collections.ObservableList
 *  javafx.concurrent.Task
 *  javafx.event.EventHandler
 *  javafx.geometry.Insets
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.control.Button
 *  javafx.scene.control.Label
 *  javafx.scene.control.ProgressBar
 *  javafx.scene.image.Image
 *  javafx.scene.layout.Border
 *  javafx.scene.layout.BorderPane
 *  javafx.scene.layout.BorderStroke
 *  javafx.scene.layout.BorderStrokeStyle
 *  javafx.scene.layout.BorderWidths
 *  javafx.scene.layout.CornerRadii
 *  javafx.scene.paint.Color
 *  javafx.scene.paint.Paint
 *  javafx.stage.Stage
 *  javafx.stage.StageStyle
 *  javafx.util.Duration
 */
package net.futureclient.installer;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.WritableValue;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.J;
import net.futureclient.installer.Na;
import net.futureclient.installer.Nv;
import net.futureclient.installer.Tu;
import net.futureclient.installer.vX;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class pw
extends Task {
    public final /* synthetic */ vX j;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = pw.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    private /* synthetic */ void F() {
        long l2 = a ^ 0x3C690FDB641L;
        long l3 = l2 ^ 0x1930A6C1A911L;
        long l4 = l2 ^ 0x68F0FCAF6F4DL;
        long l5 = l2 ^ 0x45C427914CC0L;
        long l6 = l2 ^ 0x287D296A6B48L;
        long l7 = l2 ^ 0x766AB88846EEL;
        long l8 = l2 ^ 0x7A18E7070710L;
        long l9 = l2 ^ 0x61DD0DBD8FCL;
        long l10 = l2 ^ 0x7368C13887BBL;
        long l11 = l2 ^ 0x113667724FA3L;
        Object[] arrobject = new Object[3];
        arrobject[2] = l10;
        arrobject[1] = false;
        arrobject[0] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        ye.a("G", (Object)arrobject, (long)2301175077206314788L, (long)l2);
        BorderPane borderPane = new BorderPane();
        ye.a("j", (Object)borderPane, (Object)new Insets(20.0, 20.0, 20.0, 20.0), (long)2163828536501378480L, (long)l2);
        BorderStroke[] arrborderStroke = new BorderStroke[1];
        arrborderStroke[0] = new BorderStroke((Paint)((Color)ye.a("Z", (long)2169919596296975584L, (long)l2)), (BorderStrokeStyle)ye.a("Z", (long)2251917055692244658L, (long)l2), (CornerRadii)ye.a("Z", (long)2223598051032378066L, (long)l2), new BorderWidths(1.0));
        ye.a("j", (Object)borderPane, (Object)new Border(arrborderStroke), (long)2170353466381108667L, (long)l2);
        Label label = new Label((String)((Object)pw.a("u", (int)18212, (long)(0x61D5660FE897C762L ^ l2))));
        ye.a("j", (Object)borderPane, (Object)label, (long)2122972014505823722L, (long)l2);
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = l4;
        arrobject2[1] = new ProgressBar();
        arrobject2[0] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        ProgressBar cfr_ignored_0 = (ProgressBar)ye.a("G", (Object)arrobject2, (long)2181443738500314686L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject3[0] = l8;
        ye.a("j", (Object)((ProgressBar)ye.a("G", (Object)arrobject3, (long)2092456079261174704L, (long)l2)), (Object)((String)((Object)pw.a("u", (int)17826, (long)(0x77AA40F2B598C5F9L ^ l2)))), (long)2168369969813545294L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject4[0] = l8;
        ye.a("j", (Object)((ProgressBar)ye.a("G", (Object)arrobject4, (long)2092456079261174704L, (long)l2)), (double)260.0, (long)2279946698912016758L, (long)l2);
        Object[] arrobject5 = new Object[2];
        arrobject5[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject5[0] = l8;
        ye.a("j", (Object)((ProgressBar)ye.a("G", (Object)arrobject5, (long)2092456079261174704L, (long)l2)), (boolean)true, (long)2285082656164602675L, (long)l2);
        Object[] arrobject6 = new Object[2];
        arrobject6[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject6[0] = l8;
        ye.a("j", (Object)borderPane, (Object)((ProgressBar)ye.a("G", (Object)arrobject6, (long)2092456079261174704L, (long)l2)), (long)2219614018289798548L, (long)l2);
        Button button = new Button((String)((Object)pw.a("u", (int)18837, (long)(0x7A9F77DCE19DC9D1L ^ l2))));
        ye.a("j", (Object)borderPane, (Object)button, (long)2232363008533446816L, (long)l2);
        ye.a("j", (Object)button, (double)110.0, (long)2104741850920638595L, (long)l2);
        ye.a("j", (Object)button, (boolean)false, (long)2177821836642942030L, (long)l2);
        Object[] arrobject7 = new Object[3];
        arrobject7[2] = l7;
        arrobject7[1] = new Scene((Parent)borderPane);
        arrobject7[0] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        Scene cfr_ignored_1 = (Scene)ye.a("G", (Object)arrobject7, (long)2231559635376416878L, (long)l2);
        Object[] arrobject8 = new Object[2];
        arrobject8[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject8[0] = l9;
        ye.a("j", (Object)((ObservableList)ye.a("j", (Object)((Scene)ye.a("G", (Object)arrobject8, (long)2182342350194588406L, (long)l2)), (long)2123767774305957700L, (long)l2)), (Object)((String)((Object)ye.a("j", (Object)((URL)((Object)ye.a("j", Tu.class, (Object)((String)((Object)pw.a("u", (int)22760, (long)(0x28AF4EF83C9958A7L ^ l2)))), (long)2294336929508594701L, (long)l2))), (long)2174586501196437279L, (long)l2))), (long)2090991200811192302L, (long)l2);
        Object[] arrobject9 = new Object[2];
        arrobject9[1] = new Stage();
        arrobject9[0] = l11;
        Stage cfr_ignored_2 = (Stage)ye.a("G", (Object)arrobject9, (long)2096484096135675931L, (long)l2);
        Object[] arrobject10 = new Object[1];
        arrobject10[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject10, (long)2112028484423424847L, (long)l2)), (Object)((StageStyle)ye.a("Z", (long)2164212488710700100L, (long)l2)), (long)2125509145457738734L, (long)l2);
        Object[] arrobject11 = new Object[1];
        arrobject11[0] = l3;
        Object[] arrobject12 = new Object[2];
        arrobject12[1] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        arrobject12[0] = l9;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject11, (long)2112028484423424847L, (long)l2)), (Object)((Scene)ye.a("G", (Object)arrobject12, (long)2182342350194588406L, (long)l2)), (long)2091479980967987206L, (long)l2);
        Object[] arrobject13 = new Object[1];
        arrobject13[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject13, (long)2112028484423424847L, (long)l2)), (double)300.0, (long)2093230009970435068L, (long)l2);
        Object[] arrobject14 = new Object[1];
        arrobject14[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject14, (long)2112028484423424847L, (long)l2)), (double)104.0, (long)2283811574515584477L, (long)l2);
        Object[] arrobject15 = new Object[1];
        arrobject15[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject15, (long)2112028484423424847L, (long)l2)), (long)2092261891500274815L, (long)l2);
        Object[] arrobject16 = new Object[1];
        arrobject16[0] = l3;
        Object[] arrobject17 = new Object[1];
        arrobject17[0] = l5;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject16, (long)2112028484423424847L, (long)l2)), (Object)((String)((Object)ye.a("G", (Object)arrobject17, (long)2184402077576746388L, (long)l2))), (long)2209131908864424744L, (long)l2);
        Object[] arrobject18 = new Object[1];
        arrobject18[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject18, (long)2112028484423424847L, (long)l2)), (boolean)true, (long)2252402049931585445L, (long)l2);
        Object[] arrobject19 = new Object[1];
        arrobject19[0] = l3;
        ye.a("j", (Object)((ObservableList)ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject19, (long)2112028484423424847L, (long)l2)), (long)2299857291411974364L, (long)l2)), (Object)new Image((InputStream)((Object)ye.a("j", Tu.class, (Object)((String)((Object)pw.a("u", (int)28556, (long)(0x324B7A7918B8EFDAL ^ l2)))), (long)2272510061236398429L, (long)l2))), (long)2090991200811192302L, (long)l2);
        Object[] arrobject20 = new Object[1];
        arrobject20[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject20, (long)2112028484423424847L, (long)l2)), (Object)((EventHandler)windowEvent -> {
            long l2 = a ^ 0x1C888D1D883BL;
            long l3 = l2 ^ 0x2AE986009ECEL;
            Object[] arrobject = new Object[2];
            arrobject[1] = l3;
            arrobject[0] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2528366943508980364L, (long)l2))))), (long)2343906842273217253L, (long)l2)));
            ye.a("G", (Object)arrobject, (long)2533892489467160036L, (long)l2);
        }), (long)2171614268146492162L, (long)l2);
        ye.a("j", (Object)borderPane, (Object)((EventHandler)mouseEvent -> {
            long l2 = a ^ 0x50FF0148B7E0L;
            long l3 = l2 ^ 0x755C5AA1EB93L;
            long l4 = l2 ^ 0x791F9BEC0157L;
            Object[] arrobject = new Object[3];
            arrobject[2] = (double)ye.a("j", (Object)mouseEvent, (long)2237537419130849621L, (long)l2);
            arrobject[1] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2075557039020727639L, (long)l2))))), (long)2259811599711225150L, (long)l2)));
            arrobject[0] = l3;
            ye.a("G", (Object)arrobject, (long)2020347741960089767L, (long)l2);
            Object[] arrobject2 = new Object[3];
            arrobject2[2] = (double)ye.a("j", (Object)mouseEvent, (long)2165747870955695166L, (long)l2);
            arrobject2[1] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2075557039020727639L, (long)l2))))), (long)2259811599711225150L, (long)l2)));
            arrobject2[0] = l4;
            ye.a("G", (Object)arrobject2, (long)2295391638286786591L, (long)l2);
        }), (long)2260269817467108730L, (long)l2);
        ye.a("j", (Object)borderPane, (Object)((EventHandler)mouseEvent -> {
            long l2 = a ^ 0x73AE7D13B7B9L;
            long l3 = l2 ^ 0x69584B2FA8E9L;
            long l4 = l2 ^ 0x4E64B69CEF14L;
            long l5 = l2 ^ 0x15CD6F850581L;
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            Object[] arrobject2 = new Object[2];
            arrobject2[1] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2059551786816986382L, (long)l2))))), (long)2235287331689153895L, (long)l2)));
            arrobject2[0] = l4;
            ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject, (long)2069156499552115383L, (long)l2)), (double)(ye.a("j", (Object)mouseEvent, (long)2192784978051774735L, (long)l2) - ye.a("G", (Object)arrobject2, (long)2290590208250484600L, (long)l2)), (long)2161873052384858886L, (long)l2);
            Object[] arrobject3 = new Object[1];
            arrobject3[0] = l3;
            Object[] arrobject4 = new Object[2];
            arrobject4[1] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2059551786816986382L, (long)l2))))), (long)2235287331689153895L, (long)l2)));
            arrobject4[0] = l5;
            ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject3, (long)2069156499552115383L, (long)l2)), (double)(ye.a("j", (Object)mouseEvent, (long)2214937238113899538L, (long)l2) - ye.a("G", (Object)arrobject4, (long)2089016823521763226L, (long)l2)), (long)2036385044744486142L, (long)l2);
        }), (long)2297844832668709836L, (long)l2);
        Object[] arrobject21 = new Object[1];
        arrobject21[0] = l3;
        ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject21, (long)2112028484423424847L, (long)l2)), (long)2219860940260443859L, (long)l2);
        Object[] arrobject22 = new Object[1];
        arrobject22[0] = l3;
        borderPane = (DoubleProperty)ye.a("j", (Object)((Stage)ye.a("G", (Object)arrobject22, (long)2112028484423424847L, (long)l2)), (long)2231069651172600116L, (long)l2);
        KeyFrame[] arrkeyFrame = new KeyFrame[2];
        KeyValue[] arrkeyValue = new KeyValue[1];
        arrkeyValue[0] = new KeyValue((WritableValue)borderPane, (Object)((Double)((Object)ye.a("G", (double)0.0, (long)2193534875166988947L, (long)l2))));
        arrkeyFrame[0] = new KeyFrame((Duration)ye.a("Z", (long)2186502626964659990L, (long)l2), arrkeyValue);
        KeyValue[] arrkeyValue2 = new KeyValue[1];
        arrkeyValue2[0] = new KeyValue((WritableValue)borderPane, (Object)((Double)((Object)ye.a("G", (double)1.0, (long)2193534875166988947L, (long)l2))));
        arrkeyFrame[1] = new KeyFrame(new Duration(300.0), arrkeyValue2);
        ye.a("j", (Object)new Timeline(arrkeyFrame), (long)2276746041918833368L, (long)l2);
        ye.a("j", (Object)button, (Object)((EventHandler)actionEvent -> {
            long l2 = a ^ 0xB87A7214EF2L;
            long l3 = l2 ^ 0x43592D46799AL;
            Object[] arrobject = new Object[3];
            arrobject[2] = l3;
            arrobject[1] = true;
            arrobject[0] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)-1882637298809592763L, (long)l2))))), (long)-1851492000018088916L, (long)l2)));
            ye.a("G", (Object)arrobject, (long)-1842465370369091801L, (long)l2);
        }), (long)2141764839289477414L, (long)l2);
        Object[] arrobject23 = new Object[2];
        arrobject23[1] = l6;
        arrobject23[0] = (Tu)((Object)ye.a("\u00c3", (Object)((Object)((vX)((Object)ye.a("\u00c3", (Object)((Object)this), (long)2120226861120314614L, (long)l2)))), (long)2232982311550141599L, (long)l2));
        ye.a("j", (Object)((Timer)((Object)ye.a("G", (Object)arrobject23, (long)2281978500735690122L, (long)l2))), (Object)new Nv(this, label, button), (long)0L, (long)16L, (long)2232628890122788724L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void J(Path this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 18[CATCHBLOCK]
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

    public /* synthetic */ pw(vX vX2) {
        this.j = vX2;
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

    public final /* synthetic */ Object call() {
        long l2 = a ^ 0x786D8C917B3FL;
        long l3 = l2 ^ 0x1C86CB5E1FB3L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (Void)((Object)ye.a("j", (Object)((Object)this), (Object)arrobject, (long)-3252363534206125312L, (long)l2));
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        pw.a = wu.a(7460047784216909994L, -1229811055330371167L, MethodHandles.lookup().lookupClass()).a(143251589051074L);
        pw.d = new HashMap<K, V>(13);
        var0 = pw.a ^ 42936295141267L;
        var2_1 = Cipher.getInstance(J.C("H&XK\u0003m\\_@4V)'-t\u001el\u000e,J"));
        v0 = SecretKeyFactory.getInstance(Na.C("\u0015l\u0005"));
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
        var7_3 = new String[31];
        var5_4 = 0;
        var4_5 = J.C("\u0088l\u00bc\u00c4o(\u00cb\u00a2\u001b\u00e7\u00cc\u00e9CF\u00ee&B\u00a7\u00ff!<\u001a\u0006L\u00e3\u00cbF}\u00cc\u00c0}\u0088j\u0004\u009e\u009b\u00e3KeX\u00c1[\u00dc\u0097`\u00f2\u00d0,6\u00f1\u00baW\u00af\u001c\u0095\u0007\u00121\u00e2XO\u00f2'\u00f8\u00feNe\u00ea;\u00b4\u00d8\u00aa\u00b9^M\u00b3\u000b%o[\u00a1\u00e4?\u0095\u00d0\u009atH\u0018\u00cbc\u000f\u00f2\t\\\u00b0\u00b7\u0015\u00b5\u0005u5\u009f!7?\u00d3\u00c0\u00b1Io\u0091\f\u0094\u00e9\u0092\u00b1p\u00bb@\u00e4\u0015\u008c\f\u00d0~\u00ca1\u008b\u008e\u0096\u008eR\u00a8u\u0083\u00fct\u00ac\u00fd\u00ac\u0090LZJ\u00b1\u00d7\u0011\u009b\u00f1\u0005\u008e\u00c2,\u0013\u0001\u00aa2\u00c8{\u00be\u00ab\u00e2n\u00dc\u0017\u0003!\u00e6Y\u00d2\u0007\u00bfh/\u00aa\u00b2\u0088/\u0015\u00bb'S\u00fd\u00d2\u00af\u00aaz)\u00b8]U\u00f8\u00dc\u0091O\u00a4\u00aa\u00c5\u00a9\u00c8\f\u0082\u00e5dM<D\u00e2Z\u009aS\u0000c74\u0082\u000ft,\ta\u00a7\u00ae\u0087H\u0018\u0017X\u0090z\u000e\u001b8Zk!Bk\u00fe2\u0092\u00d0\u000e\u0095\u00c3\u00ab\u00fe-!\u008f*\u00f3%\u00d1\u00d0V\u0005\u00ed\u00d6\u00c6\u00b1s\u00da\b\u00afT4\u00afU\u00f1Xa\u0096o\u0004E'\u00e5#\u00cb\u0085\u009a\u0088[^F\u0093sM\u00dc-\u00a1\u00ef1\u00c8\u008e\u008a\u009b\u00fb\u0094#\u0011\u00d2\u00ed?G\u0002\u0012.!\u001b\u00baZ\u000b\u00e9\u0015\\Hr\u0084\u00d1\u00c4\u00ad\u0089\u009a\u00b4c\u00b3\u0018\u00ee\u00fe\u000bc~F\u00e4\u001eY\b\u009co\u00fe\u00a6Wy\u00dd1\u00a2\u0083\u00ec\u00df\u00f3<X\u00c9\u0007e\u00066\u008c\u00b9\u00d7\u00e7\u00d9<\u00d2\u00e29\"\u0004\u00e1\u0003*\u00e3\u00f8D\u0095*sK\u00efq\u00c2\u0001P\"\u00b4\u0001\u0015Fi\u00bc:7\u00adx*\u00c3-4-\u001b\u0006k\u0007\b\u00bey\u00ee\u0018'x\u0096/\u009d\u00fb\u00a1\u0005\u00d6RC\u0017\u00e6\u00e0#c\u00dcz\u00c4\u00bf@X'\u001aG\u008a\u009f\u00daH\u001e\u00c6\u00bc\u00f3\u009da\u0096\u00ceV\u00e9 \u00a6W<\u009a\u001a>\u00c8\u008c\u00c4y\u00a9\u001fq9\u0011YzR\tp\u00d28Q\u0003\u00d4\u0012\u008eNK\u00d6j\u00d4Hh\u00b8\n\u0086\u0095\u00daH\u00fe\u00edZ\u000bpG\u00e5(Y\u0084\u00cc\u00c6\u00dc\u00d3\bf\u001aE\u00b5a\u00b66\u000b{\u00e6g\u0012\u00e3\u00cb\u00df\u00a5Nj\u00df\u00c8\u00bdv\u00f5\n\u00f9\u0011\u0099R\u0092w\u0004Q\u00e8\u00de\"S\u0015\u00a2\u00c6I\u0083k\u0014\u00b7\u00d1\u0003\u00e8\u00a5\u0004\u0096V\u00c2Ane\u0014\u000b\u00cc\u0092aL\u00ed\"\u00e5\u0013=\u00d0\u00ad\n\u00e9\b&A\u0019M\u0089p9U\u009e\b\"\u00bd;\u00b6\u00d0\u00ba\u009a\u00fe\u0096=\u000e\f\u00c1\u00e6\u008b\u00a0\u0003\u009dzt\u009f\u00c7\u0014\r \u00d5b\u00a0\u00d9\tw\u00eb\u00fc\u00dcb1\u00d1P\u00c34\u009f\u00f6B\u001e\u00a6<\u001ex1]\u00a6\u00a1\r\u00e8\u0091\u009bNJ\u0085\u009a\u00b7\u00de\u001dE\u0097\u0004\u00ed\u0013\u00fe]\u00eby\u00da\u0095\u0097ig|\u0014\u008e\u00b1}\u00c0\u00cdc\u008e\u0004\u00cd\u0006cX\u00f0-\u00e4\u00d0C}q\u00eb:JZLK\u00f5\u00ff\u00e2\u00f7\u00ce\u00139\u0002\u001c\u00877%M\u0098\u00d8\u00f1W\u00c5W\u00bc\u0003\\g\u00e0\u00beh\u00fd\u00a6l\u0005\u00ae\u00df\u00edj\u0005\u00b0\u0086=E\u008eU\u000e\u0099\u00e8\u00b7H\u0018\t\u009bd\u00931KE\u0092\u00af\u0091\u0080\u00dc\u00da*n2Cj\u00c5\u0001\u00c4\u001d!\u008b\u00c1\u00ea)\u00de5d\u00fd\u0081\u00d6\u00f1:\u00a3+\u00d2L\u00b6(\u00a4\u00d1$\u00b3\u00ea\u0019\u0093\u00b3\u00ed\u00e5\u00f6G<o\u000f\u00c5\u00c4\u00ff\u00e2bQv\u00f0a\u00cc\fG:\ts\u00e5\u00fdltv\u00e8\u0087\u00e7\u00dfM\u0012$\u0005\u0086\u00c7\u00ef\u00aa\u00d8\u00b1[\u0084h|\u00a4\u00d5\u00f1\u0095O\u00ac\nvG\t%\u00b7\u0086\u001cy\u0095\u0007\u00c0\u00ae\u008ax,T\u00d1\u0097z\u00abb\u0090\u00b7M2u-\u0085\u007fZ\u008c\u00c8\u00a0\u00ab\u00eb\u0090\u00a6\u0080E\u0095\u00c4\t\u00fa\u00c6?\u00ea\u00b3}g\u009b\u00c8f\u0099\u0016\u0012\u0013\u00fe\u0088\u00ff\u00c8(i\u00e1t\u008dF\u0002\u0091w\u00c0\u0000\u00a0\u001c\u00be#\u00e7\u00ec\u001c\u00aa\u001f\u00ffv\u00c9\u0085\u00d6\u0094\u0094`\u00f0\u0096U\u00eab\u00ec\u00fe:\u001f\u0005\u008c\u008e\r\u0018\u00c1\u009d\u009c\u00aa\"9\u00f5\u0086\u00a66_l\u007fH\u00eb\u0006lix\u00e7Z\u008e\u00ce\u00a8\u00905\u00d3\u0011M\u00f0\u00fa\u0082}[\u00ba\u009f\u008d\"\u00b9\u008e\u00f2\u0002\u00df\u0010TAi\u0091qLb\r\u00ef7\\\u00cbP\u00838L[\u00ben\u00d3\u00f6#5\u0090\u00a4\u00f6\u00df\u00fbl\u00a55*'N\u00bbR3&\u008d.Q7G\u008c\u00a7\u00d6W?\u0092z\u009br[l\rX$\u00edXn\u00a1\u00fb\u0096-1`\u00ae\u0090\u001c\u00b9,D\u00d4\\\u00be");
        var6_6 = var4_5.length();
        var1_7 = 16;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Na.C("\u00de8@\bW\u009e'\u0098\u0092v\u00c7;W(\f\u0091E\u00bfa\u00f3\u00b2O\u001eO#s\u00ba\u00b0\u0093\u00d6\u00e2e\u00db");
                var6_6 = var4_5.length();
                var1_7 = 16;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = pw.a(var2_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = pw.a(var2_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        pw.b = var7_3;
                        pw.c = new String[31];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x1C9C;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Na.C("i\u0017yz|\u0002qbb\u0006x\u0017\u0019\u0003\u0011kJ8G1"));
                    arrobject[1] = SecretKeyFactory.getInstance(J.C(" X!"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Na.C("!O!_iB<E=H1F<Z.Fb[#H0M?\u001cj\\~Y!"), exception);
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
            byte[] arrby2 = b[n2].getBytes(J.C("G2\u001d\u00104[>]0C"));
            pw.c[n2] = pw.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ Void h(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 61[CATCHBLOCK]
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
    private static /* synthetic */ boolean X(Path this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[CATCHBLOCK]
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
}

