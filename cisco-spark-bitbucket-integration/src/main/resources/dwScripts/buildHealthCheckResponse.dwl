%dw 1.0
%output application/json
---
{
	"result": "Integration is working correctly.",
	"bitbucketHookResult": flowVars.getHookResult
}