package com.mobileapptracker;

final class q implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ MobileAppTracker b;

    q(MobileAppTracker mobileAppTracker, String str) {
        this.b = mobileAppTracker;
        this.a = str;
    }

    public final void run() {
        this.b.params.setInstallReferrer(this.a);
    }
}
