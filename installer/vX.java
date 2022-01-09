/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.concurrent.Service
 *  javafx.concurrent.Task
 */
package net.futureclient.installer;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import net.futureclient.installer.Tu;
import net.futureclient.installer.pw;

public final class vX
extends Service {
    public final /* synthetic */ Tu J;

    public /* synthetic */ vX(Tu tu) {
        this.J = tu;
    }

    public final /* synthetic */ Task createTask() {
        return new pw(this);
    }
}

