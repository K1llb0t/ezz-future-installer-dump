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
import net.futureclient.installer.NH;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class vc {
    private /* synthetic */ String q;
    private /* synthetic */ boolean C;
    private /* synthetic */ int o;
    private /* synthetic */ String R;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private /* synthetic */ String U;

    public /* synthetic */ vc(int n2, String string, String string2, String string3, boolean bl) {
        vc vc2 = this;
        vc vc3 = this;
        this.o = n2;
        vc3.U = string;
        vc3.R = string2;
        vc2.q = string3;
        vc2.C = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-4305248884108605595L, -7742919473124373996L, MethodHandles.lookup().lookupClass()).a(189929638128807L);
        d = new HashMap(13);
        long l2 = a ^ 0x1393F880E46AL;
        Cipher cipher = Cipher.getInstance(NH.C("jkh\u0014'&x\u0014d\u007frb\u0003fPUHE\b\u0001"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(NH.C("h#5"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (n3 < 8) {
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        String[] arrstring = new String[2];
        int n5 = 0;
        String string = NH.C("\u00e5c<\u00fc\u00baS\u00d8\u00afZ\u001c\u00d3|\u00ea\u00f7\u0017\u00d4+zJ:<\u00daP\u009b\u00f0N\u00aa\u00d2\u00f2.\u00d6H\u00f9");
        int n6 = string.length();
        int n7 = 16;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = vc.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(NH.C("xby\u001b\t\t\u0019\u0015KW")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[2];
                return;
            }
            n7 = string.charAt(n2);
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

    public final /* synthetic */ int hashCode() {
        Object object;
        CallSite callSite;
        long l2;
        block2: {
            block3: {
                l2 = a ^ 0x3EF455C53D0AL;
                CallSite callSite2 = ye.a("G", (long)-6422955226081670210L, (long)l2);
                try {
                    callSite = ye.a("\u00c3", (Object)this, (long)-6402810170161286697L, (long)l2);
                    object = ye.a("\u00c3", (Object)this, (long)-6381808577592157192L, (long)l2);
                    if (callSite2 == null) break block2;
                    if (object == false) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-6624553260577481418L, (long)l2));
                }
                object = 64;
                break block2;
            }
            object = false;
        }
        return (int)(callSite + object + ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)-6435051014419062098L, (long)l2)), (long)-6390483181642087324L, (long)l2) * ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)-6395674690166153371L, (long)l2)), (long)-6390483181642087324L, (long)l2) * ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)-6584188329157527441L, (long)l2)), (long)-6390483181642087324L, (long)l2));
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
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
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x76B1;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(NH.C("hij\u0016wvw\u001bmviyC&OJ_RW^"));
                    arrobject[1] = SecretKeyFactory.getInstance(NH.C("\u007f|j"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(NH.C("B\u0013\u0002\u001eWCB^YIOUPQZ@\u001bTSY^\u0017\u001aBKI\u0014OZ"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NH.C("cy9[\u0016\u0016\u000e\u0002\u0014\b"));
            vc.c[n2] = vc.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ String toString() {
        String string;
        StringBuilder stringBuilder;
        long l2;
        block4: {
            l2 = a ^ 0x7FD4E64A72F6L;
            CallSite callSite = ye.a("G", (long)-1647942116784569278L, (long)l2);
            try {
                stringBuilder = (StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)-1635270577347908270L, (long)l2))), (long)-1462335023011419389L, (long)l2))), (char)'.', (long)-1692995936421676788L, (long)l2))), (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)-1674847708629708647L, (long)l2))), (long)-1462335023011419389L, (long)l2))), (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)-1487310779827505261L, (long)l2))), (long)-1462335023011419389L, (long)l2));
                string = (String)((Object)vc.a("c", (int)12528, (long)(0x4E0A401B4F412C79L ^ l2)));
                if (callSite == null) return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)stringBuilder, (Object)string, (long)-1462335023011419389L, (long)l2))), (char)')', (long)-1692995936421676788L, (long)l2))), (long)-1703581514690982676L, (long)l2));
                stringBuilder = (StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)stringBuilder, (Object)string, (long)-1462335023011419389L, (long)l2))), (int)ye.a("\u00c3", (Object)this, (long)-1668329458651070933L, (long)l2), (long)-1476418680656212877L, (long)l2));
                if (ye.a("\u00c3", (Object)this, (long)-1688001271235390460L, (long)l2) == false) break block4;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-1446611192883653942L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-1446611192883653942L, (long)l2));
                }
            }
            string = (String)((Object)vc.a("c", (int)1691, (long)(0x46940BA290449A13L ^ l2)));
            return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)stringBuilder, (Object)string, (long)-1462335023011419389L, (long)l2))), (char)')', (long)-1692995936421676788L, (long)l2))), (long)-1703581514690982676L, (long)l2));
        }
        string = "";
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)stringBuilder, (Object)string, (long)-1462335023011419389L, (long)l2))), (char)')', (long)-1692995936421676788L, (long)l2))), (long)-1703581514690982676L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean equals(Object this) {
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = vc.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }
}

