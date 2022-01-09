/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N8;
import net.futureclient.installer.X7;
import net.futureclient.installer.XJ;
import net.futureclient.installer.XM;
import net.futureclient.installer.Xc;
import net.futureclient.installer.Xu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class X2 {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void f(Object[] this_) {
        CallSite callSite;
        long l2;
        Class class_;
        block6: {
            CallSite callSite2;
            block7: {
                class_ = (Class)this_[0];
                l2 = (Long)this_[1];
                l2 = a ^ l2;
                CallSite callSite3 = ye.a("G", (long)-5894354561819557040L, (long)l2);
                callSite2 = ye.a("j", (Object)class_, (long)-5812344938107108576L, (long)l2);
                try {
                    callSite = ye.a("G", (int)callSite2, (long)-5886154900047704274L, (long)l2);
                    if (callSite3 == null) break block6;
                    if (callSite == false) break block7;
                    throw new UnsupportedOperationException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)X2.a("j", (int)17206, (long)(0x2E820C3105C97674L ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)class_, (long)-5794571933146599944L, (long)l2))), (long)-6005866031918683119L, (long)l2))), (long)-5815845855160153090L, (long)l2)));
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    try {
                        throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)-5818255320413839427L, (long)l2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException2) {
                        throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException2, (long)-5818255320413839427L, (long)l2));
                    }
                }
            }
            callSite = ye.a("G", (int)callSite2, (long)-6033048003309235963L, (long)l2);
        }
        try {
            if (callSite == false) return;
            throw new UnsupportedOperationException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)X2.a("j", (int)29634, (long)(0x553A58A284864682L ^ l2)))), (Object)((String)((Object)ye.a("j", (Object)class_, (long)-5794571933146599944L, (long)l2))), (long)-6005866031918683119L, (long)l2))), (long)-5815845855160153090L, (long)l2)));
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)-5818255320413839427L, (long)l2));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        X2.a = wu.a(-2177976608059167304L, -5771014960561954150L, MethodHandles.lookup().lookupClass()).a(173137397871849L);
        X2.d = new HashMap<K, V>(13);
        var0 = X2.a ^ 97341970543428L;
        var2_1 = Cipher.getInstance(N8.C("?wBw\\\u0014\u0003&\u001fM\tPxT+g3ws3"));
        v0 = SecretKeyFactory.getInstance(X7.C(";&f"));
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
        var7_3 = new String[8];
        var5_4 = 0;
        var4_5 = N8.C("\u00b5isAPNn\u00bc\u000f\"c`\u00e5~\u00eed\u0012\u00bc\u00ecp\u00a3)TO3\u00ca\u00c5\f$\u00b9\u00de\u00eb\u00fbL@\u00a2\u00c95'\"\u0014\u0017\u00d9\u00bf\u00a7\u00ff\u00f3\u00fa>\u00ef\u009e\u0089y\u00e5\u00c9\u00d6\u009f\u000e\b\u009d\u00a7\u009e\u0002\u00e1?jT\u009c\u001c\u0083E\u0007\u00bd\u00f37ww\u0085+\u00a6f\u008cW\u00ad\u00a2\u001d\u00afO\u00ac\u00d4\u00ae;\u00b8\u00c2\\\u00e1\u009a\t\u001c\u00a7\u007f\u009f\u00c4*w\u00e3\u009fH\u00c8\u008djG\u00077o\f&\u00cb8\"v\u00df\u00fafb1l:\u00d9\u0093\u009a\u00cc!*>\u00f11\u00ffJLd\u00e62\u00a7\u00a8wk\u00b6\u00dbR\u0011\u001dQ\u00f8D\u0099x\u00ee\u000eM\u00aa\u00ac\u00c1\u00a2e+\u00d7?\u00e0\u00e6\u008e\u0004\u00ace.\u00f0\u000b}\u00b0\u00a1\u00df\r\u009bk\u00d2\u0018\u00d7l\u00da\u00c8\u00b4\b\"yh\u00a9\u00b9A\u0085\u00e54L\u000b\u008a\u00ac\u0089\u00f3\u001b9K~\u00b1\u00a9\b\u001a\u00ad\u0097\u00ed\u00b1y\u00e1\u001f\u0097\u0088\u00d2\u00a2\\\u00b8\n\u00d9\u00b4u\u0093~!\u0005\u00f9\u00dd\u009a\u008d\u00db\u00f4\u00fd\fg\u00cf\u00ea\u00fe\u00c9\u0005*\u00d1;");
        var6_6 = var4_5.length();
        var1_7 = 40;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = X7.C("\u00a5B\u000bK\u00c1\n\u000b\u00d5\u00c9\u00b1a\u00bf\u008c\u0083h\u000b\u00f5\u0089 \u00be'\u0087e\u0012G=\f\u009c\u0081\u0099\u00c1T?B\u00c8\u0004\u00b5\u00c9C\u00bdo+c\u00c3y\u00ca\u00e8\u00ce5vN\u00b7\u0002\u001a\u0001S\u00c3\u00d9@\u0097\u0082\u0090\u00e4@v\u00b9\u00d1\u00dc\u00d8\u00a1q\u00c1\u00d9\u009ba#\"\u009fPW\u0092\u0001\u0015\u00f3\u00df\n\u00daW6\u00a4\u00d3\u00ee\u008b\u00031\u00de\u00c4\u000e\u00cej\u00b0dR\u00a0\u009e,e|\b\u0098\u008dK\u00d0\u00e8\u0090\u00f1\u00f04\u009a\u00f7/\u00af\u00a00G\u00f0\u000f\u0002\u00fd");
                var6_6 = var4_5.length();
                var1_7 = 40;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = X2.a(var2_1.doFinal(v6.getBytes(N8.C("\u0003P\u0002)r;b'0e")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = X2.a(var2_1.doFinal(v6.getBytes(N8.C("\u0003P\u0002)r;b'0e")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        X2.b = var7_3;
                        X2.c = new String[8];
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

    public static /* synthetic */ X2 W(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        try {
            GenericDeclaration genericDeclaration = (Class)((Object)ye.a("G", (String)((Object)X2.a("j", (int)11208, (long)(0x55C22DC75592569BL ^ l2))), (long)7437526820275692553L, (long)l2));
            Field field = (Field)((Object)ye.a("j", (Object)genericDeclaration, (Object)((String)((Object)X2.a("j", (int)413, (long)(0x6CFFBCFCC56AFCCFL ^ l2)))), (long)7459434547154157397L, (long)l2));
            ye.a("j", (Object)field, (boolean)true, (long)7261075161633983105L, (long)l2);
            Object object = ye.a("j", (Object)field, null, (long)7422532519147742480L, (long)l2);
            Class[] arrclass = new Class[1];
            arrclass[0] = Class.class;
            genericDeclaration = (Method)((Object)ye.a("j", (Object)genericDeclaration, (Object)((String)((Object)X2.a("j", (int)18921, (long)(0x3067D98D519FB4BFL ^ l2)))), (Object)arrclass, (long)7276508469228130533L, (long)l2));
            return new Xu((Method)genericDeclaration, object);
        }
        catch (Exception exception) {
            try {
                Class[] arrclass = new Class[1];
                arrclass[0] = Class.class;
                Method method = (Method)((Object)ye.a("j", ObjectStreamClass.class, (Object)((String)((Object)X2.a("j", (int)31628, (long)(0x72A86CA5EB7A06DCL ^ l2)))), (Object)arrclass, (long)7251136618123058190L, (long)l2));
                ye.a("j", (Object)method, (boolean)true, (long)7465784890011661318L, (long)l2);
                Object[] arrobject = new Object[1];
                arrobject[0] = Object.class;
                CallSite callSite = ye.a("j", (Object)((Integer)((Object)ye.a("j", (Object)method, null, (Object)arrobject, (long)7456949045828858605L, (long)l2))), (long)7266973623432051282L, (long)l2);
                Class[] arrclass2 = new Class[2];
                arrclass2[0] = Class.class;
                arrclass2[1] = (Class)((Object)ye.a("Z", (long)7451943538359986038L, (long)l2));
                Method method2 = (Method)((Object)ye.a("j", ObjectStreamClass.class, (Object)((String)((Object)X2.a("j", (int)21176, (long)(0x6AE93E217C22AFE9L ^ l2)))), (Object)arrclass2, (long)7251136618123058190L, (long)l2));
                ye.a("j", (Object)method2, (boolean)true, (long)7465784890011661318L, (long)l2);
                return new Xc(method2, (int)callSite);
            }
            catch (Exception exception2) {
                try {
                    Class[] arrclass = new Class[2];
                    arrclass[0] = Class.class;
                    arrclass[1] = Class.class;
                    Method method = (Method)((Object)ye.a("j", ObjectInputStream.class, (Object)((String)((Object)X2.a("j", (int)6223, (long)(0x740ED790D355651BL ^ l2)))), (Object)arrclass, (long)7251136618123058190L, (long)l2));
                    ye.a("j", (Object)method, (boolean)true, (long)7465784890011661318L, (long)l2);
                    return new XM(method);
                }
                catch (Exception exception3) {
                    return new XJ();
                }
            }
        }
    }

    public abstract /* synthetic */ Object Y(Object[] var1);

    private static /* synthetic */ UnsupportedOperationException a(UnsupportedOperationException this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x186E;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(X7.C("m:oEr%rHh%l*Fud7\u000bPR\r"));
                    arrobject[1] = SecretKeyFactory.getInstance(N8.C("\u001c\u0007X"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(X7.C("\u0011\u0016Q\u001b\u0004F\u0011[\nL\u001cP\u0003T\tEHQ\u0000\\\r\u0012Ii6\u001d\u0016dX"), exception);
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
            byte[] arrby2 = b[n2].getBytes(N8.C("\u0018KBiC\n$ao:"));
            X2.c[n2] = X2.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = X2.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }
}

