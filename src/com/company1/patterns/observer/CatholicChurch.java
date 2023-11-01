package com.company1.patterns.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CatholicChurch {
    private PropertyChangeSupport support;
    private String news;

    public CatholicChurch() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
