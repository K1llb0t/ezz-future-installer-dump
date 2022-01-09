/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.ET;
import net.futureclient.installer.NH;
import net.futureclient.installer.Xb;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Ts {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] c;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public /* synthetic */ Ts(long this) {
        block18: {
            block19: {
                block16: {
                    block17: {
                        block14: {
                            block15: {
                                block12: {
                                    block13: {
                                        block10: {
                                            block11: {
                                                block20: {
                                                    this = Ts.a ^ this;
                                                    var3_2 = this ^ 4382755980590L;
                                                    super();
                                                    if (0L < 0L) break block20;
                                                    v0 = true;
                                                    v1 = var3_2;
                                                    ** GOTO lbl19
                                                }
                                                v0 = false;
                                                try {
                                                    v1 = var3_2;
lbl19:
                                                    // 2 sources

                                                    v2 = new Object[2];
                                                    v2[1] = v1;
                                                    v2[0] = v0;
                                                    ye.a("G", (Object)v2, (long)3465207380355944989L, (long)this);
                                                    cfr_temp_0 = 0L - 0L;
                                                    v3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                    if (this <= 0L) break block10;
                                                    if (v3 < 0) break block11;
                                                    v3 = 1;
                                                    break block10;
                                                }
                                                catch (RuntimeException v4) {
                                                    throw (RuntimeException)ye.a("G", (Object)v4, (long)3691073669445562837L, (long)this);
                                                }
                                            }
                                            v3 = 0;
                                        }
                                        try {
                                            v5 = new Object[2];
                                            v5[1] = var3_2;
                                            v5[0] = (boolean)v3;
                                            ye.a("G", (Object)v5, (long)3465207380355944989L, (long)this);
                                            cfr_temp_1 = 0L - 0L;
                                            v6 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                            if (this <= 0L) break block12;
                                            if (v6 < 0) break block13;
                                            v6 = 1;
                                            break block12;
                                        }
                                        catch (RuntimeException v7) {
                                            throw (RuntimeException)ye.a("G", (Object)v7, (long)3691073669445562837L, (long)this);
                                        }
                                    }
                                    v6 = 0;
                                }
                                try {
                                    v8 = new Object[2];
                                    v8[1] = var3_2;
                                    v8[0] = (boolean)v6;
                                    ye.a("G", (Object)v8, (long)3465207380355944989L, (long)this);
                                    cfr_temp_2 = 0L - 0L;
                                    v9 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                    if (this <= 0L) break block14;
                                    if (v9 < 0) break block15;
                                    v9 = 1;
                                    break block14;
                                }
                                catch (RuntimeException v10) {
                                    throw (RuntimeException)ye.a("G", (Object)v10, (long)3691073669445562837L, (long)this);
                                }
                            }
                            v9 = 0;
                        }
                        try {
                            v11 = new Object[2];
                            v11[1] = var3_2;
                            v11[0] = (boolean)v9;
                            ye.a("G", (Object)v11, (long)3465207380355944989L, (long)this);
                            cfr_temp_3 = 0L - 0L;
                            v12 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                            if (this < 0L) break block16;
                            if (v12 < 0) break block17;
                            v12 = 1;
                            break block16;
                        }
                        catch (RuntimeException v13) {
                            throw (RuntimeException)ye.a("G", (Object)v13, (long)3691073669445562837L, (long)this);
                        }
                    }
                    v12 = 0;
                }
                try {
                    v14 = new Object[2];
                    v14[1] = var3_2;
                    v14[0] = (boolean)v12;
                    ye.a("G", (Object)v14, (long)3465207380355944989L, (long)this);
                    cfr_temp_4 = 0L - 0L;
                    v15 = cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                    if (this < 0L) break block18;
                    if (v15 < 0) break block19;
                    v15 = 1;
                    break block18;
                }
                catch (RuntimeException v16) {
                    throw (RuntimeException)ye.a("G", (Object)v16, (long)3691073669445562837L, (long)this);
                }
            }
            v15 = 0;
        }
        v17 = new Object[2];
        v17[1] = var3_2;
        v17[0] = (boolean)v15;
        ye.a("G", (Object)v17, (long)3465207380355944989L, (long)this);
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x1A383292B715L;
        long l3 = l2 ^ 0x37C925116FCFL;
        long l4 = l2 ^ 0x60142243857DL;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = this;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = 0L;
        arrobject2[1] = (String)((Object)Ts.a("i", (int)32135, (long)(0x4A07F08185625AD3L ^ l2)));
        arrobject2[0] = l4;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = 0L;
        arrobject3[1] = (String)((Object)Ts.a("i", (int)31936, (long)(0x274069BB9D3DDB91L ^ l2)));
        arrobject3[0] = l4;
        Object[] arrobject4 = new Object[3];
        arrobject4[2] = 0L;
        arrobject4[1] = (String)((Object)Ts.a("i", (int)7534, (long)(0x574802E2D89EBA3CL ^ l2)));
        arrobject4[0] = l4;
        Object[] arrobject5 = new Object[3];
        arrobject5[2] = 0L;
        arrobject5[1] = (String)((Object)Ts.a("i", (int)3349, (long)(0x736167AA3BAA2A40L ^ l2)));
        arrobject5[0] = l4;
        Object[] arrobject6 = new Object[3];
        arrobject6[2] = 0L;
        arrobject6[1] = (String)((Object)Ts.a("i", (int)13967, (long)(0x2F61C295093491DFL ^ l2)));
        arrobject6[0] = l4;
        Object[] arrobject7 = new Object[3];
        arrobject7[2] = 0L;
        arrobject7[1] = (String)((Object)Ts.a("i", (int)636, (long)(0x6E6CFE0578A7252FL ^ l2)));
        arrobject7[0] = l4;
        return (String)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("j", (Object)((ET)((Object)ye.a("G", (Object)arrobject, (long)-7050701931307741215L, (long)l2))), (Object)arrobject2, (long)-6957426053411633263L, (long)l2))), (Object)arrobject3, (long)-6957426053411633263L, (long)l2))), (Object)arrobject4, (long)-6957426053411633263L, (long)l2))), (Object)arrobject5, (long)-6957426053411633263L, (long)l2))), (Object)arrobject6, (long)-6957426053411633263L, (long)l2))), (Object)arrobject7, (long)-6957426053411633263L, (long)l2))), (long)-6985844450275379114L, (long)l2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x3B59;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Xb.C("!71Z4\"9B*&07Q#YK&<\u000b\u0015"));
                    arrobject[1] = SecretKeyFactory.getInstance(NH.C("o|j"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Xb.C("\u0001\u0007\u0001\u0017I\n\u001c\r\u001d\u0000\u0011\u000e\u001c\u0012\u000e\u000eB\u0013\u0003\u0000\u0010\u0005\u001fTJ0z1\u0001"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NH.C("cy9[44\u001e\u0012\u0014\b"));
            Ts.c[n2] = Ts.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        Ts.a = wu.a(7230588735292445066L, -3499548410264109121L, MethodHandles.lookup().lookupClass()).a(42288960396306L);
        Ts.d = new HashMap<K, V>(13);
        var0 = Ts.a ^ 9098702595943L;
        var2_1 = Cipher.getInstance(NH.C("HIx\u0004'&x\u0014d\u007frb\u0003fPUHE\b\u0001"));
        v0 = SecretKeyFactory.getInstance(Xb.C("\u0011 !"));
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
        var7_3 = new String[6];
        var5_4 = 0;
        var4_5 = NH.C("\u00ff\u00ba\u00df\u0089\u00e2FK\u00c7\u0007i\b\u0085\u0097^\u00ae0\u000b\u00c1G\u00d9\u001f\u00df\u00d5\u00b6J\u00a5\u00a1\u00e2\u0083\u00c9\u009f\u00ae%\u0093\u00c8\u00879z\u00b2\u0003\u0082\u00a4\u00efR\u00a9:\u0019\u00d5\u00a3n\u0001\u00be\u008e\u00f4\u00b1\u001c!\u001e`\u00df\u0097:_\u00a4\u00b2\u0087o\u00c0\u00f4\u00fc\u0005\u009e\u00d1^E-\u00e7/\u00de\u001a\u00a2\u00e4\u00deL\u0089m\u0011\u00c4]h\u00e4\u00b2+\u008c\u00e5\u00fcX\u0018\f${\u00fd`\u00c5\u00bc\u00ab\u00dd1\u00b9\u0086\u00ff\u00eb\u00b4?1\u00c0\u00a9\u00f0[\u0097P\u0095@\u000b\u001a\u00c9\u00b0\u0005\u00d5l\u00fd");
        var6_6 = var4_5.length();
        var1_7 = 32;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Xb.C("\u00c2j\u00e3\u000e\r\u00e9l\u000f\u00c3\u0004\n\u00bc\u00d0\u00a1bE\u008b\u00a7v\u000eobz\u00b8G\u008f\u00cf\u0091\u00f5\u00e4\u00a9\u00a3[m\u00a6\u00f5.\u00a9\u0091\u0083\u009ao\u00e8\u00ec\u00fb\u00d5\u00a1\u009b\u00e1\u0000{\u00dc\u00da:_\u008e\u0087\u00e3\u0096l{\u0014\u00b3\u00eb\u0084!\u00a9\u00a7\u00dc\u00b2\t7E");
                var6_6 = var4_5.length();
                var1_7 = 32;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = Ts.a(var2_1.doFinal(v6.getBytes(NH.C("xby\u001b\t\t\u0019\u0015KW")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = Ts.a(var2_1.doFinal(v6.getBytes(NH.C("xby\u001b\t\t\u0019\u0015KW")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        Ts.b = var7_3;
                        Ts.c = new String[6];
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ boolean equals(Object object) {
        long l2 = a ^ 0x7BA020136670L;
        CallSite callSite = ye.a("G", (long)5653248263115580183L, (long)l2);
        try {
            boolean bl = object instanceof Ts;
            if (callSite == null) return bl;
            if (!bl) return false;
        }
        catch (RuntimeException runtimeException) {
            try {
                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)5543201538743520769L, (long)l2));
            }
            catch (RuntimeException runtimeException2) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)5543201538743520769L, (long)l2));
                                                            }
                                                            catch (RuntimeException runtimeException3) {
                                                                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException3, (long)5543201538743520769L, (long)l2));
                                                            }
                                                        }
                                                        catch (RuntimeException runtimeException4) {
                                                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException4, (long)5543201538743520769L, (long)l2));
                                                        }
                                                    }
                                                    catch (RuntimeException runtimeException5) {
                                                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException5, (long)5543201538743520769L, (long)l2));
                                                    }
                                                }
                                                catch (RuntimeException runtimeException6) {
                                                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException6, (long)5543201538743520769L, (long)l2));
                                                }
                                            }
                                            catch (RuntimeException runtimeException7) {
                                                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException7, (long)5543201538743520769L, (long)l2));
                                            }
                                        }
                                        catch (RuntimeException runtimeException8) {
                                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException8, (long)5543201538743520769L, (long)l2));
                                        }
                                    }
                                    catch (RuntimeException runtimeException9) {
                                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException9, (long)5543201538743520769L, (long)l2));
                                    }
                                }
                                catch (RuntimeException runtimeException10) {
                                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException10, (long)5543201538743520769L, (long)l2));
                                }
                            }
                            catch (RuntimeException runtimeException11) {
                                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException11, (long)5543201538743520769L, (long)l2));
                            }
                        }
                        catch (RuntimeException runtimeException12) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException12, (long)5543201538743520769L, (long)l2));
                        }
                    }
                    catch (RuntimeException runtimeException13) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException13, (long)5543201538743520769L, (long)l2));
                    }
                }
                catch (RuntimeException runtimeException14) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException14, (long)5543201538743520769L, (long)l2));
                }
            }
        }
        long l3 = 0L - 0L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (callSite == null) return (boolean)l4;
        if (l4 == false) {
            long l5 = 0L - 0L;
            l4 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
            if (callSite == null) return (boolean)l4;
            if (l4 == false) {
                long l6 = 0L - 0L;
                l4 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                if (callSite == null) return (boolean)l4;
                if (l4 == false) {
                    long l7 = 0L - 0L;
                    l4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (callSite == null) return (boolean)l4;
                    if (l4 == false) {
                        long l8 = 0L - 0L;
                        l4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (callSite == null) return (boolean)l4;
                        if (l4 == false) {
                            long l9 = 0L - 0L;
                            l4 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
                            if (callSite == null) return (boolean)l4;
                            if (l4 == false) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        l4 = 0;
        return (boolean)l4;
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Ts.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x57C3EF05F89DL;
        Object[] arrobject = new Object[6];
        arrobject[0] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        arrobject[1] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        arrobject[2] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        arrobject[3] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        arrobject[4] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        arrobject[5] = (Long)((Object)ye.a("G", (long)0L, (long)-3364717547762945253L, (long)l2));
        return (int)ye.a("G", (Object)arrobject, (long)-3392210232875740372L, (long)l2);
    }
}

