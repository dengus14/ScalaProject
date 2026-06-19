# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Purpose

This is a **learning project** — the developer is learning Scala and functional programming from scratch by building a limit order-matching engine. All code is written by the developer themselves; Claude's role is to teach concepts, review code via leading questions, and guide — not to write project code.

## Build

- **Scala 3.3.4** with **sbt 1.11.4**
- `sbt compile` — compile the project
- `sbt run` — run the project (once a main entry point exists)

## Architecture

A limit order-matching engine with domain types as Scala ADTs (sealed traits / case classes):

- `Side` — buy or sell (sealed trait with case objects)
- `Order` — represents an intent to trade (side, quantity, price, ID)
- `Trade` — represents a matched trade between two orders

Source files live in `src/main/scala/`. No packages are used currently.

## Collaboration Rules

- **Do not write project code** — the developer writes every line. Push back if asked.
- **Review via leading questions** — don't state what's wrong; ask questions that guide the developer to find issues themselves. Only give direct hints if explicitly asked after multiple attempts.
- **Be honest in review** — don't validate code just because it was written. If it's fine, say so. If not, use leading questions.
- **Teach concepts freely** — explanations of Scala/FP concepts are encouraged; the restriction is only on writing actual project code.
