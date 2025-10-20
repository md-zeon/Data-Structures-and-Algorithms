#!/bin/bash

# Stage all changes
echo "📦 Staging changes..."
git add .

# Check if there are changes to commit
if git diff --staged --quiet; then
    echo "❌ No changes to commit"
    exit 0
fi

# Generate AI commit message using GitHub Copilot
echo "🤖 Generating AI commit message..."
commit_message=$(gh copilot suggest -t shell "git commit message for these changes" 2>/dev/null | grep -v "^Suggestion:" | grep -v "^$" | head -1)

# Fallback if gh copilot fails
if [ -z "$commit_message" ]; then
    echo "⚠️  GitHub Copilot unavailable, using default message"
    commit_message="Update: $(date '+%Y-%m-%d %H:%M:%S')"
fi

# Show the generated message
echo "📝 Commit message: $commit_message"

# Commit with the AI-generated message
echo "💾 Committing changes..."
git commit -m "$commit_message"

# Push to remote
echo "🚀 Pushing to remote..."
git push

echo "✅ Done!"
