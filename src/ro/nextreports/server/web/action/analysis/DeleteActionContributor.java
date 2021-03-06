package ro.nextreports.server.web.action.analysis;

import java.util.List;

import org.apache.wicket.markup.html.link.AbstractLink;
import org.apache.wicket.model.StringResourceModel;

import ro.nextreports.server.domain.Entity;
import ro.nextreports.server.web.core.action.AbstractActionContributor;
import ro.nextreports.server.web.core.action.ActionContext;

public class DeleteActionContributor extends AbstractActionContributor {

	public static final String ID = DeleteActionContributor.class.getName();

	// does not matter for analysis	
	public boolean support(List<Entity> entities) {
		return true;
	}

	public String getActionImage() {
		return "images/delete.gif";
	}

	public String getActionName() {
		return new StringResourceModel("DashboardPopupMenuModel.delete", null).getString();
	}

	public String getId() {
		return ID;
	}

	public AbstractLink getLink(final ActionContext actionContext) {
		return new DeleteActionLink((AnalysisActionContext)actionContext);
	}

}
