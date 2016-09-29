%dw 1.0
%output application/json
---
{
	"description": "Bitbucket for Cisco-Spark",
    "url": flowVars.hookBody.url,
    "active": flowVars.hookBody.active,
    "events": flowVars.hookBody.events
}