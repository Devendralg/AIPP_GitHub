// This is slingshot version 3.2.0
// CHANGE: Updated default value from false to true for Prompt to Persona
export const SETTINGS_SCHEMA = {
  'slingshot.enablePromptToPersona': {
    type: 'boolean',
    default: true, // CHANGE: Changed from false to true
    description: 'Enable Prompt to Persona feature to find intent based on user prompt and enrich it accordingly for better conversation alignment.',
    scope: 'window'
  }
};