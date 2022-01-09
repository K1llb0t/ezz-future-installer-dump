/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import net.futureclient.installer.EX;
import net.futureclient.installer.L;
import net.futureclient.installer.Nk;
import net.futureclient.installer.e;
import net.futureclient.installer.k;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class vV
extends vA {
    private static final /* synthetic */ long a;
    private final /* synthetic */ List f;
    public static final /* synthetic */ Nk O;

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }

    public static /* synthetic */ {
        a = wu.a(-1405965440169357376L, 1027665582618966965L, MethodHandles.lookup().lookupClass()).a(118350597972108L);
        O = new EX();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private synchronized /* synthetic */ Date Z(Object[] object) {
        v0 = object;
        object = (String)v0[0];
        l2 = (Long)v0[1];
        l2 = vV.a ^ l2;
        v1 = l2 ^ 89845020734811L;
        l4 = v1 >>> 8;
        n2 = (int)(v1 << 56 >>> 56);
        iterator = (Iterator)ye.a("j", (Object)((List)ye.a("\u00c3", (Object)this, (long)2593339845176619592L, (long)l2)), (long)2336552066498906407L, (long)l2);
        callSite = ye.a("G", (long)2511351412189646777L, (long)l2);
        while (true) {
            block11: {
                try {
                    v2 = iterator;
                    if (callSite == null) break block11;
                    if (ye.a("j", (Object)v2, (long)2527643275101641154L, (long)l2) == false) break;
                    v3 = iterator;
                    ** GOTO lbl37
                }
                catch (ParseException v4) {
                    try {
                        throw (Exception)ye.a("G", (Object)v4, (long)2576079375384812673L, (long)l2);
                    }
                    catch (ParseException v5) {
                        throw (Exception)ye.a("G", (Object)v5, (long)2576079375384812673L, (long)l2);
                    }
lbl37:
                    // 2 sources

                    v2 = ye.a("j", (Object)v3, (long)2354774498149532117L, (long)l2);
                }
            }
            dateFormat = (DateFormat)v2;
            try {
                return (Date)ye.a("j", (Object)dateFormat, (Object)object, (long)2530060277764789819L, (long)l2);
            }
            catch (ParseException v6) {
                if (l2 < 0L || callSite != null) continue;
            }
            break;
        }
        try {
            parsePosition = new ParsePosition(0);
            v7 = new Object[4];
            v7[3] = parsePosition;
            v7[2] = (int)((byte)n2);
            v7[1] = l4;
            v7[0] = object;
            return (Date)ye.a("G", (Object)v7, (long)2565340767662018794L, (long)l2);
        }
        catch (ParseException parseException) {
            throw new k((String)object, parseException);
        }
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0x5EB66B6FA985L;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = (Date)object2;
        arrobject2[1] = l3;
        arrobject2[0] = object;
        ye.a("j", (Object)this, (Object)arrobject2, (long)8322570292062357309L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ vV(long this) {
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

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object object2;
        long l2;
        long l3;
        long l4;
        block6: {
            Object object3;
            long l5;
            block5: {
                Object[] arrobject = object;
                object = (vM)object[0];
                l4 = (Long)arrobject[1];
                long l6 = l4 ^ 0x1F749D2A225EL;
                l3 = l4 ^ 0x50EF1C9F79BL;
                l2 = l4 ^ 0x2DDF1F36CD42L;
                l5 = l4 ^ 0x496AB47BC053L;
                object2 = object;
                object = this;
                CallSite callSite = ye.a("G", (long)8437222746236131444L, (long)l4);
                try {
                    object3 = object2;
                    if (callSite == null) break block5;
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l6;
                    if ((e)((Object)ye.a("j", (Object)object3, (Object)arrobject2, (long)8627073254665083946L, (long)l4)) != (e)((Object)ye.a("Z", (long)8405723837677561737L, (long)l4))) break block6;
                    object3 = object2;
                }
                catch (k k2) {
                    try {
                        throw (Exception)((Object)ye.a("G", (Object)k2, (long)8362347934414064460L, (long)l4));
                    }
                    catch (k k3) {
                        throw (Exception)((Object)ye.a("G", (Object)k3, (long)8362347934414064460L, (long)l4));
                    }
                }
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l5;
            ye.a("j", (Object)object3, (Object)arrobject, (long)8623531842780404199L, (long)l4);
            return null;
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = l2;
        arrobject3[0] = (String)((Object)ye.a("j", (Object)object2, (Object)arrobject, (long)8390924752238081716L, (long)l4));
        return (Date)((Object)ye.a("\u00aa", (Object)object, (Object)arrobject3, (long)8627036716224987309L, (long)l4));
    }

    /*
     * Exception decompiling
     */
    private synchronized /* synthetic */ void R(Object[] this) {
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
}

