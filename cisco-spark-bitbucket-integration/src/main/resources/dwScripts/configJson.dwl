%dw 1.0
%output application/json
---
{
  "configJson": {
        "repo_id": flowVars.repoId,
        "displayName": flowVars.displayName,
        "events": flowVars.events,
        "webhookUuid":flowVars.hookId
    }
	
}