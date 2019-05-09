package io.jenkins.plugins.analysis.warnings;



import edu.hm.hafner.analysis.parser.xmlparser.XmlParser;

import io.jenkins.plugins.analysis.core.model.ReportScanningTool;

/**
 * Provides a parser for custom XML-Report. Delegates to {@link XmlParser }.
 *
 * @author Raphael Furch
 */
public class XmlReport extends ReportScanningTool {

    private static final long serialVersionUID = -8140998828889265517L;

    @Override
    public XmlParser  createParser() {
        return new XmlParser();
    }
}
