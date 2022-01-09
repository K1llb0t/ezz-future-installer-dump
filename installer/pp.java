/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import net.futureclient.installer.EF;
import net.futureclient.installer.L;
import net.futureclient.installer.pL;
import net.futureclient.installer.pR;
import net.futureclient.installer.vA;
import net.futureclient.installer.vW;
import net.futureclient.installer.ye;

public final class pp
extends pR {
    private /* synthetic */ pL t;
    private /* synthetic */ boolean z;
    private /* synthetic */ vA o;
    private /* synthetic */ boolean C;
    private /* synthetic */ EF v;
    private /* synthetic */ Field r;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ boolean D(Object[] this) {
        block8: {
            block9: {
                var2_2 = (Long)this /* !! */ [0];
                this /* !! */  = this /* !! */ [1];
                var4_3 = ye.a("G", (long)4311715462179804853L, (long)var2_2);
                try {
                    v0 = this;
                    v1 /* !! */  = var4_3;
                    if (var2_2 > 0L) {
                        if (v1 /* !! */  == null) break block8;
                        v2 = 4130418679407806001L;
                        v3 = var2_2;
                        if (v3 <= 0L) break block9;
                        if (ye.a("\u00c3", (Object)v0, (long)v2, (long)v3) == false) {
                            return false;
                        }
                    }
                    ** GOTO lbl34
                }
                catch (RuntimeException v4) {
                    try {
                        throw (RuntimeException)ye.a("G", (Object)v4, (long)4289900492328104523L, (long)var2_2);
                    }
                    catch (RuntimeException v5) {
                        throw (RuntimeException)ye.a("G", (Object)v5, (long)4289900492328104523L, (long)var2_2);
                    }
                }
                v6 = this;
                v2 = 4218188517166567194L;
                v3 = var2_2;
            }
            v0 = ye.a("j", (Object)((Field)ye.a("\u00c3", (Object)v6, (long)v2, (long)v3)), (Object)this /* !! */ , (long)4247587705709230304L, (long)var2_2);
        }
        try {
            v1 /* !! */  = this /* !! */ ;
lbl34:
            // 2 sources

            if (v0 == v1 /* !! */ ) return false;
            return true;
        }
        catch (RuntimeException v7) {
            throw (RuntimeException)ye.a("G", (Object)v7, (long)4289900492328104523L, (long)var2_2);
        }
    }

    public /* synthetic */ pp(String string, boolean bl, boolean bl2, Field field, boolean bl3, vA vA2, EF eF, pL pL2, boolean bl4) {
        pp pp2 = this;
        pp pp3 = this;
        this.r = field;
        pp3.C = bl3;
        pp3.o = vA2;
        pp2.v = eF;
        pp2.t = pL2;
        this.z = bl4;
        super(string, bl, bl2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void E(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[TRYBLOCK]
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
    public final /* synthetic */ void j(Object[] object) {
        L l2;
        vA vA2;
        long l3;
        long l4;
        block7: {
            L l5;
            block6: {
                pp pp2;
                block5: {
                    l5 = (L)object[0];
                    object = object[1];
                    l4 = (Long)object[2];
                    l3 = l4 ^ 0xDE9CB28D8F9L;
                    object = ye.a("j", (Object)((Field)((Object)ye.a("\u00c3", (Object)this, (long)-6102078781789643071L, (long)l4))), (Object)object, (long)-6113217350884923077L, (long)l4);
                    CallSite callSite = ye.a("G", (long)-6193221446443219090L, (long)l4);
                    try {
                        pp2 = this;
                        if (callSite == null) break block5;
                        if (ye.a("\u00c3", (Object)pp2, (long)-6072772338608007959L, (long)l4) == false) break block6;
                        pp2 = this;
                    }
                    catch (RuntimeException runtimeException) {
                        try {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-6173376865883921520L, (long)l4));
                        }
                        catch (RuntimeException runtimeException2) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-6173376865883921520L, (long)l4));
                        }
                    }
                }
                vA2 = (vA)((Object)ye.a("\u00c3", (Object)pp2, (long)-6070632522121978840L, (long)l4));
                l2 = l5;
                break block7;
            }
            vA2 = new vW((EF)((Object)ye.a("\u00c3", (Object)this, (long)-6320103490463608261L, (long)l4)), (vA)((Object)ye.a("\u00c3", (Object)this, (long)-6070632522121978840L, (long)l4)), (Type)((Object)ye.a("\u00c3", (Object)((pL)((Object)ye.a("\u00c3", (Object)this, (long)-6175823168624602669L, (long)l4))), (long)-6286132109716389809L, (long)l4)));
            l2 = l5;
        }
        Object[] arrobject = new Object[3];
        arrobject[2] = object;
        arrobject[1] = l3;
        arrobject[0] = l2;
        ye.a("j", (Object)vA2, (Object)arrobject, (long)-6076947182398067513L, (long)l4);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }
}

