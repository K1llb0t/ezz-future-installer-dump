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
import net.futureclient.installer.Ns;
import net.futureclient.installer.Tu;

public final class X5
extends Service {
    public final /* synthetic */ Tu D;

    public /* synthetic */ X5(Tu tu) {
        this.D = tu;
    }

    public final /* synthetic */ Task createTask() {
        return new Ns(this);
    }
}

