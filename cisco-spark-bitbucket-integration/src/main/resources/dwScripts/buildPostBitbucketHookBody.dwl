%dw 1.0
%output application/java
---
{
  description: flowVars.displayName,
  url: flowVars.notificationUrl,
  active: true,
  events: flowVars.events
}