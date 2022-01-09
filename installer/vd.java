/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.Nk;
import net.futureclient.installer.Xt;
import net.futureclient.installer.o;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class vd
implements Nk {
    private final /* synthetic */ o M;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ pL q;
    private static final /* synthetic */ long a;
    private final /* synthetic */ Class F;
    private final /* synthetic */ Xt r;

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ vA V(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 14[CATCHBLOCK]
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public static /* synthetic */ {
        a = wu.a(-993096862695727697L, 1629179915410256489L, MethodHandles.lookup().lookupClass()).a(253633921584237L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public /* synthetic */ vd(long this, Object this, pL this, boolean this, Class this) {
        block22: {
            block21: {
                block20: {
                    block24: {
                        block19: {
                            block18: {
                                block23: {
                                    block17: {
                                        block16: {
                                            this = vd.a ^ this;
                                            v0 = this ^ 55545392714311L;
                                            var7_6 = v0 >>> 32;
                                            var9_7 = (int)(v0 << 32 >>> 32);
                                            v1 = ye.a("G", (long)9086650999848506233L, (long)this);
                                            super();
                                            var10_8 = v1;
                                            try {
                                                v2 = this;
                                                v3 = this;
                                                if (var10_8 == null) break block16;
                                                if (!(v3 instanceof Xt)) break block17;
                                                v3 = this;
                                            }
                                            catch (RuntimeException v4) {
                                                try {
                                                    throw (RuntimeException)ye.a("G", (Object)v4, (long)8977989736649616047L, (long)this);
                                                }
                                                catch (RuntimeException v5) {
                                                    throw (RuntimeException)ye.a("G", (Object)v5, (long)8977989736649616047L, (long)this);
                                                }
                                            }
                                        }
                                        v6 = (Xt)v3;
                                        break block23;
                                    }
                                    v6 = null;
                                }
                                try {
                                    try {
                                        v2.r = v6;
                                        v7 = this;
                                        v8 = this;
                                        if (var10_8 == null) break block18;
                                        if (!(v8 instanceof o)) break block19;
                                        v8 = this;
                                    }
                                    catch (RuntimeException v9) {
                                        throw (RuntimeException)ye.a("G", (Object)v9, (long)8977989736649616047L, (long)this);
                                    }
                                }
                                catch (RuntimeException v10) {
                                    throw (RuntimeException)ye.a("G", (Object)v10, (long)8977989736649616047L, (long)this);
                                }
                            }
                            v11 = (o)v8;
                            break block24;
                        }
                        v11 = null;
                    }
                    try {
                        try {
                            v7.M = v11;
                            v12 = this;
                            if (this <= 0L || var10_8 == null) break block20;
                            if (v12.r == null) {
                                v12 = this;
                                break block20;
                            }
                            ** GOTO lbl70
                        }
                        catch (RuntimeException v13) {
                            throw (RuntimeException)ye.a("G", (Object)v13, (long)8977989736649616047L, (long)this);
                        }
                    }
                    catch (RuntimeException v14) {
                        throw (RuntimeException)ye.a("G", (Object)v14, (long)8977989736649616047L, (long)this);
                    }
                }
                try {
                    if (v12.M == null) break block21;
lbl70:
                    // 2 sources

                    v15 = true;
                    break block22;
                }
                catch (RuntimeException v16) {
                    throw (RuntimeException)ye.a("G", (Object)v16, (long)8977989736649616047L, (long)this);
                }
            }
            v15 = false;
        }
        v17 = new Object[3];
        v17[2] = var9_7;
        v17[1] = var7_6;
        v17[0] = v15;
        ye.a("G", (Object)v17, (long)9093030896584366939L, (long)this);
        v18 = this;
        this.q = this;
        v18.i = this;
        v18.F = this;
    }
}

