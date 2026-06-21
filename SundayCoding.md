# Sunday Coding Plan — Order-Matching Engine

## Phase 1: Housekeeping (~15 min)
- Fix `hellSymbol` → `Symbol`
- `sbt compile` clean

## Phase 2: OrderBook Data Structure (~1.5 hrs)
- Immutable case class (buy list, sell list, trades)
- Price-priority sorting (buys desc, sells asc)
- Learn: `Ordering`, `List` vs `Vector`

## Phase 3: Adding Orders (~1.5 hrs)
- `add(order)` → new OrderBook
- Pattern match on Side
- Test in `sbt console`

## Phase 4: Matching Engine (~2 hrs)
- Recursive matching: best buy >= best sell → trade
- Partial fills, exact fills, no-match
- Learn: tail recursion, `@tailrec`

## Phase 5: Main App (~1 hr)
- `Main.scala` entry point
- Add sample orders, print trades
- `sbt run`

## Phase 6: Unit Tests (~1.5 hrs)
- Add ScalaTest to `build.sbt`
- Tests: validation, sort order, matching, partial fills, no-match

## Phase 7: Refactor & Stretch (~30 min)
- Review for FP best practices
- Stretch: time priority, Either error handling, REPL loop
