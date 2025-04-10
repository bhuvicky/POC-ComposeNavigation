You're using a plugin-style dynamic feature architecture where 
each feature (e.g., auth, home) registers itself into a shared factory (FeatureListFactory). 
This factory is used to dynamically embed composables across modules.

compose screens which are embed into other layouts should not have nav arguments.

if nav args are string type, no need to specify nav types, savedStateHandle take care. URI parse with string type only