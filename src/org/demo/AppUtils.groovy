package org.demo

class AppUtils implements Serializable {

    String applicationName

    AppUtils(String applicationName) {
        this.applicationName = applicationName
    }

    String getMessage() {
        return "Application: ${applicationName}"
    }
}
