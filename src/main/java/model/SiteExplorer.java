package model;

import model.config.IConfigurator;
import model.report.Reportable;

import java.net.URL;


/**
 * Created by faust on 27.11.15.
 */
public class SiteExplorer implements ISiteExplorer {
    private Reportable report;

    public SiteExplorer(Reportable report) {
        this.report = report;
    }

    public Reportable explore(IConfigurator config) {
        return null;
    }
}
