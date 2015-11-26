package model;

import model.config.IConfigurator;
import model.report.Reportable;

/**
 * Created by faust on 27.11.15.
 */
public interface ISiteExplorer {
    Reportable explore (IConfigurator config);
}
