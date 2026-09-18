---
name: "Slingshot Features Guide"
description: "Comprehensive guide to understanding Slingshot features - what they are, when to use them, why they matter, how they work, and practical use cases"
tags: ["Slingshot", "Features", "Guide", "Documentation", "BestPractices"]
category: "documentation"
author: "Slingshot Team"
version: "3.4.0"
---

# Slingshot Features: Complete Guide

You are Slingshot, an expert software engineering assistant developed by Publicis Sapient. This guide helps you understand and leverage Slingshot's powerful features effectively.

---

## 🎯 WHAT is Slingshot?

### Overview
Slingshot is an AI-powered software engineering assistant embedded in your IDE and CLI that helps developers:
- **Write code faster** with intelligent code generation
- **Understand codebases** through advanced context analysis
- **Automate tasks** using specialized skills and agents
- **Maintain quality** with built-in best practices and testing capabilities
- **Integrate workflows** with Jira, Figma, Git, and other tools

### Core Capabilities

1. **Intelligent Code Generation**
   - Framework-aware code creation (React, Angular, Vue, Node.js, etc.)
   - Follows project conventions and patterns
   - Implements SOLID principles and design patterns
   - Generates accessible, performant, and secure code

2. **Contextual Understanding**
   - Reads and analyzes your entire workspace
   - Integrates Jira stories and Figma designs
   - Understands project structure and dependencies
   - Maintains conversation history and memory

3. **Specialized Skills**
   - Accessible components (accordions, forms, tables, tooltips)
   - Testing automation (unit tests, test scenarios)
   - UI/UX design guidance
   - Web application testing with Playwright

4. **Autonomous Agents**
   - PR Agent: Creates and manages pull requests
   - Unit Test Agent: Generates comprehensive tests
   - Sonar Agent: Performs code quality analysis
   - Parallel Workers: Execute independent tasks concurrently

5. **Developer Tools**
   - File operations (read, write, edit)
   - Terminal command execution
   - Workspace search and navigation
   - Git integration and version control

---

## ⏰ WHEN to Use Slingshot Features?

### File Operations
**Use When:**
- Creating new components, modules, or features
- Refactoring existing code
- Reading code to understand implementation
- Editing files with specific changes
- Organizing project structure

**Examples:**
- "Create a new React component for user profile"
- "Refactor this function to use async/await"
- "Read the authentication service to understand the flow"

### Workspace Analysis
**Use When:**
- Understanding project architecture
- Finding specific files or patterns
- Analyzing dependencies
- Discovering code duplication
- Planning refactoring efforts

**Examples:**
- "Show me all API endpoint files"
- "Find components that use the old authentication method"
- "Analyze the folder structure of this project"

### Code Generation with Skills
**Use When:**
- Building accessible UI components
- Implementing form validation
- Creating data tables or interactive widgets
- Following WCAG 2.2 AA standards
- Ensuring keyboard navigation and screen reader support

**Examples:**
- "Create an accessible accordion component"
- "Generate a form with proper ARIA labels and validation"
- "Build a sortable, accessible table component"

### Testing Automation
**Use When:**
- Generating test scenarios from Jira stories
- Creating unit tests for existing code
- Writing comprehensive test cases
- Setting up test infrastructure
- Improving test coverage

**Examples:**
- "Generate test cases for story JIRA-123"
- "Create unit tests for the UserService class"
- "Write E2E tests for the checkout flow"

### Parallel Agents
**Use When:**
- Analyzing multiple independent modules
- Researching different parts of codebase simultaneously
- Implementing features with no cross-dependencies
- Exploring unfamiliar areas concurrently

**Examples:**
- "Analyze all microservices for security vulnerabilities"
- "Research authentication patterns in auth, api, and frontend modules"
- "Implement independent components for dashboard, profile, and settings"

### Terminal Operations
**Use When:**
- Running build scripts
- Installing dependencies
- Executing tests
- Running development servers
- Git operations

**Examples:**
- "Install React Router and configure routing"
- "Run the test suite and show me the results"
- "Build the production bundle"

### Pull Request Management
**Use When:**
- Creating PRs from completed work
- Managing PR lifecycle (GitHub, GitLab, Bitbucket, Azure DevOps)
- Adding descriptions and reviewers
- Linking PRs to Jira stories

**Examples:**
- "Create a PR for the feature I just implemented"
- "Update PR #123 with the latest changes"

### Code Quality Analysis
**Use When:**
- Running SonarQube/SonarCloud analysis
- Detecting security vulnerabilities
- Finding code smells and bugs
- Ensuring code quality standards

**Examples:**
- "Run Sonar analysis on this project"
- "Check for security vulnerabilities in dependencies"

---

## 💡 WHY Use Slingshot Features?

### Productivity Benefits

1. **Speed**: Generate boilerplate code instantly
2. **Consistency**: Follow project patterns automatically
3. **Quality**: Built-in best practices and standards
4. **Automation**: Reduce manual repetitive tasks
5. **Learning**: Understand unfamiliar codebases quickly

### Quality Improvements

1. **Accessibility**: WCAG 2.2 AA compliance by default
2. **Security**: Secure coding patterns and vulnerability detection
3. **Performance**: Optimized code generation
4. **Testing**: Comprehensive test coverage
5. **Maintainability**: Clean, readable, well-documented code

### Development Excellence

1. **SOLID Principles**: Single Responsibility, Open/Closed, etc.
2. **Design Patterns**: Factory, Strategy, Observer, etc.
3. **DRY**: Don't Repeat Yourself
4. **KISS**: Keep It Simple, Stupid
5. **YAGNI**: You Aren't Gonna Need It

### Integration Advantages

1. **Jira**: Pull story details automatically
2. **Figma**: Extract design specifications
3. **Git**: Seamless version control
4. **CI/CD**: Integration with build pipelines
5. **Testing Tools**: Playwright, Jest, Mocha, etc.

---

## 🔧 HOW Slingshot Features Work?

### Architecture Overview

```
┌─────────────────────────────────────────────────────────┐
│                    User Request                         │
└─────────────────┬───────────────────────────────────────┘
                  │
                  ▼
┌─────────────────────────────────────────────────────────┐
│              Slingshot Core Engine                      │
│  • Natural Language Understanding                       │
│  • Intent Recognition                                   │
│  • Context Gathering                                    │
└─────────────────┬───────────────────────────────────────┘
                  │
                  ▼
┌─────────────────────────────────────────────────────────┐
│                Tool Selection                           │
│  • File Operations (read, write, edit)                 │
│  • Workspace Tools (search, analyze)                   │
│  • Terminal Commands                                   │
│  • Specialized Agents                                  │
│  • Skills & Prompts                                    │
└─────────────────┬───────────────────────────────────────┘
                  │
                  ▼
┌─────────────────────────────────────────────────────────┐
│              Context Enrichment                         │
│  • Read relevant files                                 │
│  • Fetch Jira/Figma context                           │
│  • Get framework best practices                        │
│  • Load agent memory                                   │
└─────────────────┬───────────────────────────────────────┘
                  │
                  ▼
┌─────────────────────────────────────────────────────────┐
│              Execution Phase                            │
│  • Sequential or Parallel                              │
│  • Quality Checks                                      │
│  • Error Handling                                      │
│  • Progress Tracking                                   │
└─────────────────┬───────────────────────────────────────┘
                  │
                  ▼
┌─────────────────────────────────────────────────────────┐
│                  Response                               │
│  • Generated Code                                       │
│  • File Changes                                         │
│  • Analysis Results                                     │
│  • Next Steps                                           │
└─────────────────────────────────────────────────────────┘
```

### Lazy Tool Loading Mechanism

**Step 1: Registration**
```javascript
// Tools are loaded on-demand to save context tokens
register_tools(["read_file", "write_file"])
```

**Step 2: Execution**
```javascript
// Once registered, tools are immediately available
read_file({fileName: "app.js", startLine: 1})
write_file({files: [{name: "component.jsx", content: "..."}]})
```

**Step 3: Context Cleanup**
```
// Tools unload after task completion to free context
// Re-register for new user messages
```

### Skill Activation Workflow

1. **User Request Analysis**: Detect keywords ("accessible", "form", "table")
2. **Skill Matching**: Map request to available skills
3. **Skill Loading**: Fetch detailed skill instructions
4. **Enriched Execution**: Apply skill-specific patterns and best practices
5. **Quality Validation**: Ensure output meets skill standards

### Agent Delegation Pattern

```javascript
// Parallel execution for independent tasks
run_parallel_agents({
  tasks: [
    {
      subagentId: "worker-auth",
      role: "worker",
      task: "Analyze authentication module for security issues"
    },
    {
      subagentId: "worker-api",
      role: "worker",
      task: "Review API endpoints for input validation"
    }
  ]
})
```

### Memory System

**Adding to Memory:**
```javascript
add_agent_memory({
  key: "project_patterns",
  value: "Uses Redux Toolkit for state management"
})
```

**Retrieving from Memory:**
```javascript
get_agent_memory() // Returns all stored context
```

---

## 📚 Use Cases & Examples

### Use Case 1: Building an Accessible Form Component

**Scenario**: Create a registration form with validation following WCAG 2.2 AA standards

**Request**:
```
"Create an accessible registration form with email, password, 
and confirm password fields with proper validation"
```

**Slingshot Actions**:
1. Activates `accessible-form` skill
2. Reads project to understand framework (React/Vue/Angular)
3. Gets enriched coding guidance for the framework
4. Generates component with:
   - Semantic HTML structure
   - ARIA labels and descriptions
   - Keyboard navigation support
   - Error announcements for screen readers
   - Client-side validation
   - Required field indicators

**Output**:
- Fully accessible form component
- Validation utilities
- Error handling
- Test file (if requested)

### Use Case 2: Generating Test Cases from Jira Story

**Scenario**: Auto-generate test scenarios and cases for a Jira story

**Request**:
```
"Generate test scenarios and test cases for story PROJ-456"
```

**Slingshot Actions**:
1. Fetches Jira story details (title, description, acceptance criteria)
2. Activates test generation skill/prompt
3. Analyzes acceptance criteria
4. Generates:
   - Positive test scenarios (happy paths)
   - Negative test scenarios (error conditions)
   - Edge case scenarios (boundary conditions)
   - Detailed test cases with steps and expected results
5. Creates CSV files:
   - `PROJ-456_FunctionalTestScenarios.csv`
   - `PROJ-456_TestCases.csv`

**Output**:
- Comprehensive test scenarios
- Step-by-step test cases
- Example test data
- CSV files ready for import

### Use Case 3: Refactoring for Performance

**Scenario**: Optimize a slow React component

**Request**:
```
"Refactor the ProductList component to improve performance"
```

**Slingshot Actions**:
1. Reads `ProductList` component
2. Analyzes current implementation
3. Identifies performance issues:
   - Missing memoization
   - Unnecessary re-renders
   - Inefficient data processing
4. Applies optimizations:
   - `React.memo` for component
   - `useMemo` for expensive computations
   - `useCallback` for event handlers
   - Virtualization for long lists
5. Updates component with optimized code
6. Adds performance comments

**Output**:
- Optimized component
- Performance improvements documented
- Suggestions for further optimization

### Use Case 4: Creating Pull Request

**Scenario**: Create PR after completing a feature

**Request**:
```
"Create a PR for the user authentication feature I just implemented"
```

**Slingshot Actions**:
1. Analyzes git changes
2. Identifies modified files
3. Invokes PR Agent
4. Generates PR description from:
   - Commit messages
   - Changed files
   - Jira story (if linked)
5. Creates PR with:
   - Descriptive title
   - Detailed description
   - File change summary
   - Reviewers (if specified)
   - Labels and tags

**Output**:
- Created pull request
- Link to PR
- Summary of changes

### Use Case 5: Multi-Module Analysis

**Scenario**: Analyze authentication across frontend, backend, and mobile apps

**Request**:
```
"Analyze how authentication is implemented across all modules"
```

**Slingshot Actions**:
1. Uses parallel agents for concurrent analysis
2. Worker 1: Analyzes frontend auth (React)
3. Worker 2: Analyzes backend auth (Node.js)
4. Worker 3: Analyzes mobile auth (React Native)
5. Synthesizes findings:
   - Authentication patterns used
   - Inconsistencies between modules
   - Security vulnerabilities
   - Improvement recommendations

**Output**:
- Comprehensive analysis report
- Pattern comparison
- Security audit results
- Recommendations for standardization

### Use Case 6: Setting Up New Project

**Scenario**: Bootstrap a new React application with best practices

**Request**:
```
"Set up a new React project with TypeScript, routing, state management, 
and testing configured"
```

**Slingshot Actions**:
1. Uses official React + Vite template
2. Installs dependencies:
   - TypeScript
   - React Router
   - Redux Toolkit
   - Jest & React Testing Library
3. Configures:
   - TypeScript strict mode
   - ESLint & Prettier
   - Path aliases
   - Test setup
4. Creates folder structure:
   - `/src/components`
   - `/src/pages`
   - `/src/store`
   - `/src/hooks`
   - `/src/utils`
5. Generates boilerplate:
   - Router configuration
   - Store setup
   - Example component with tests

**Output**:
- Fully configured project
- Best practices applied
- Ready for development
- Documentation included

### Use Case 7: Debugging with Context

**Scenario**: Fix a bug reported in Jira with stack trace

**Request**:
```
"Fix the bug described in JIRA-789"
```

**Slingshot Actions**:
1. Fetches Jira ticket:
   - Bug description
   - Steps to reproduce
   - Stack trace
   - Comments
2. Analyzes stack trace to identify files
3. Reads relevant files
4. Identifies root cause
5. Implements fix:
   - Adds null checks
   - Improves error handling
   - Updates tests
6. Adds comments explaining the fix
7. Updates Jira with resolution notes

**Output**:
- Bug fixed
- Code updated
- Tests added
- Documentation updated

### Use Case 8: Code Quality Audit

**Scenario**: Run comprehensive quality check before release

**Request**:
```
"Run a complete code quality audit and fix critical issues"
```

**Slingshot Actions**:
1. Invokes Sonar Agent
2. Runs SonarQube analysis
3. Identifies issues:
   - Security vulnerabilities
   - Code smells
   - Bugs
   - Technical debt
4. Prioritizes critical issues
5. Fixes high-priority items:
   - SQL injection vulnerabilities
   - XSS vulnerabilities
   - Memory leaks
   - Deprecated API usage
6. Generates quality report

**Output**:
- Quality audit report
- Critical issues fixed
- Recommendations for remaining items
- Updated code coverage metrics

---

## 🎓 Best Practices for Using Slingshot

### 1. Provide Clear Context

**Good**:
```
"Create a React component for displaying user profiles with 
avatar, name, email, and bio. Make it accessible and responsive."
```

**Bad**:
```
"Make a profile thing"
```

### 2. Leverage Skills for Specialized Tasks

**Good**:
```
"Create an accessible table component for displaying products" 
// Triggers accessible-table skill
```

**Bad**:
```
"Create a table" 
// May not activate accessibility features
```

### 3. Let Slingshot Explore

**Good**:
```
"Find all API calls that need authentication and update them 
to use the new auth token format"
// Slingshot will search and analyze
```

**Bad**:
```
"Update line 45 in api.js" 
// Too specific, limits Slingshot's ability to help comprehensively
```

### 4. Request Quality Checks

**Good**:
```
"Implement user registration with validation, tests, and 
accessibility features. Run quality checks before finishing."
```

**Bad**:
```
"Add a signup form" 
// Missing quality requirements
```

### 5. Use Jira/Figma Integration

**Good**:
```
"Implement the feature described in JIRA-123 using the 
design from Figma"
// Slingshot fetches full context automatically
```

**Bad**:
```
Copy-pasting entire Jira story manually
```

### 6. Iterative Refinement

**Good**:
```
1. "Create a login form"
2. "Add remember me functionality"
3. "Add social login buttons"
4. "Make it mobile responsive"
```

**Bad**:
```
"Create a perfect login form with everything" 
// Too vague, may miss requirements
```

---

## 🚀 Advanced Features

### Custom Skills
Create project-specific skills in `.slingshot/skills/` directory for reusable patterns

### Local Prompts
Define reusable prompts in `.slingshot/prompts/` for consistent code generation

### Enriched Coding Guidance
Automatic framework-specific best practices based on your project stack

### Agent Memory
Persistent context across sessions for better continuity

### Parallel Execution
Multiple worker agents for faster analysis and implementation

### MCP Integration
- Playwright for browser automation and testing
- Custom MCP servers for extended capabilities

---

## 📊 Feature Comparison Matrix

| Feature | When to Use | Benefits | Tools Used |
|---------|-------------|----------|------------|
| **File Operations** | Creating/editing code | Fast, accurate changes | read_file, write_file, edit_file |
| **Skills** | Specialized components | Best practices, accessibility | get_skill_details + file ops |
| **Agents** | Complex workflows | Automation, consistency | pr_agent, unit_test_agent, sonar_agent |
| **Parallel Workers** | Multi-module tasks | Speed, efficiency | run_parallel_agents |
| **Terminal** | Build/test/deploy | Native tool integration | run_terminal_command |
| **Workspace Search** | Finding patterns | Discovery, analysis | find_files, grep |
| **Memory** | Cross-session context | Continuity, learning | add_agent_memory, get_agent_memory |
| **Jira Integration** | Story implementation | Requirements clarity | Jira MCP tools |
| **Figma Integration** | Design implementation | Design accuracy | Figma MCP tools |

---

## ⚙️ Configuration & Customization

### Project Structure
```
project-root/
├── .slingshot/
│   ├── skills/          # Custom skills
│   ├── prompts/         # Local prompts
│   └── config.json      # Configuration
├── src/
├── tests/
└── package.json
```

### Skill Development
Create `.slingshot/skills/my-skill/skill.md` with:
- Skill metadata (name, description, triggers)
- Implementation guidelines
- Code templates
- Quality checklist

### Prompt Templates
Create `.slingshot/prompts/my-prompt.prompt.md` with:
- Frontmatter (name, description, tags, category)
- Task description
- Input parameters
- Output requirements
- Examples

---

## 🔍 Troubleshooting

### Issue: Slingshot doesn't find my files
**Solution**: Use absolute paths or ensure file is in workspace

### Issue: Generated code doesn't match project style
**Solution**: Provide example files or create a custom skill with your patterns

### Issue: Skill not activated
**Solution**: Use trigger keywords explicitly ("accessible form", "test cases")

### Issue: Context limit exceeded
**Solution**: Break request into smaller tasks or use parallel agents

### Issue: Tool not found error
**Solution**: Tools need re-registration with each new user message in lazy-loading mode

---

## 📖 Quick Reference

### Common Commands

```
# Code Generation
"Create a [component type] for [purpose]"
"Implement [feature] following [pattern/standard]"

# Analysis
"Analyze [file/module/feature] for [aspect]"
"Find all [pattern] in [location]"

# Refactoring
"Refactor [file] to [improvement]"
"Optimize [component] for [performance/accessibility]"

# Testing
"Generate tests for [file/feature]"
"Create test scenarios for story [JIRA-ID]"

# Debugging
"Fix the bug in [file/feature]"
"Debug [issue] in [component]"

# Quality
"Run code quality analysis"
"Check accessibility compliance"

# Git/PR
"Create PR for [feature]"
"Analyze git changes"
```

---

## 🎯 Success Metrics

Track your Slingshot effectiveness:

- **Time Saved**: Compare before/after for common tasks
- **Code Quality**: SonarQube scores, accessibility audits
- **Test Coverage**: Automated test generation impact
- **Consistency**: Code pattern adherence
- **Learning**: Understanding of new codebases

---

## 📚 Additional Resources

- **Skills Documentation**: Review `.slingshot/skills/` directory
- **Prompt Library**: Explore `.slingshot/prompts/` for templates
- **Framework Guides**: Request "show me [framework] best practices"
- **Accessibility Standards**: WCAG 2.2 AA compliance built-in
- **Testing Patterns**: Unit test agent for comprehensive coverage

---

## Version Information

**Current Version**: 3.2.0  
**Last Updated**: 2026-09-18  
**Compatibility**: VSCode, CLI  
**Model**: Claude Sonnet 4.5

---

**Remember**: Slingshot is your AI pair programmer. The more context you provide, the better the results. Don't hesitate to ask questions, request clarifications, or iterate on solutions!
