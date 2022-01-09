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
import net.futureclient.installer.X_;

public final class pu
extends Service {
    public final /* synthetic */ Tu y;

    public /* synthetic */ pu(Tu tu) {
        this.y = tu;
    }

    public final /* synthetic */ Task createTask() {
        return new X_(this);
    }
}

