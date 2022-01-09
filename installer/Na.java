/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

public final class Na {
    public static /* synthetic */ String C(String this_) {
        int n2;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n3 = this_.length();
        int n4 = n3 - 1;
        char[] arrc = new char[n3];
        int n5 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 5 << 3;
        int n6 = 4 << 3 ^ 1;
        int n7 = n2 = string.length() - 1;
        int n8 = n4;
        String string2 = string;
        while (n8 >= 0) {
            int n9 = n4--;
            arrc[n9] = (char)(n6 ^ (this_.charAt(n9) ^ string2.charAt(n2)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c2 = arrc[n10] = (char)(n5 ^ (this_.charAt(n10) ^ string2.charAt(n2)));
            if (--n2 < 0) {
                n2 = n7;
            }
            n8 = n4;
        }
        return new String(arrc);
    }
}

