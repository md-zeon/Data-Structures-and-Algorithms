#!/bin/bash

# Check if the current directory is a git repository
if [ ! -d ".git" ]; then
    echo "❌ This is not a git repository."
    exit 1
fi

# If commit message is passed as argument, use it; otherwise, ask for input
if [ -z "$1" ]; then
    read -p "Enter commit message: " commitMsg
else
    commitMsg="$*"
fi

# Stage all changes
echo "📦 Adding all changes..."
git add .

# Commit with message
echo "📝 Committing changes..."
git commit -m "$commitMsg"

# Push to the current branch
branch=$(git rev-parse --abbrev-ref HEAD)
echo "⬆️  Pushing to branch '$branch'..."
git push origin "$branch"

echo "✅ Code pushed successfully!"
