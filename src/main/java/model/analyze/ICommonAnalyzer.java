package model.analyze;

import model.config.IConfigurator;
import model.report.Reportable;

/**
 * Created by faust on 27.11.15.
 */
public interface ICommonAnalyzer {
    Reportable analyze (IConfigurator conf);
}
