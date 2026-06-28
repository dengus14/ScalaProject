# Coding Plan — Order-Matching Engine

## Phase 1: Housekeeping — DONE
- Fixed `hellSymbol` → `Symbol`
- `sbt compile` clean

## Phase 2: OrderBook Data Structure — DONE
- Immutable case class with `buyOrders`, `sellOrders`, `trades`
- Private constructor + companion object `apply` for auto-sorting
- Buys sorted descending (highest first), sells ascending (lowest first)
- Learned: companion objects, `apply`, `sortBy`, `private` constructors, case class fields as vals

## Phase 3: Adding Orders — DONE
- `add(order)` → new OrderBook via pattern matching on `Side`
- Prepend with `::`, route through `apply` (no `new`) to maintain sort invariant
- Tested in `sbt console`

## Phase 4: Matching Engine — TODO (start here next session)
- Build a `matchOrders` method inside `OrderBook`
- Core logic: if best buy price >= best sell price → create a Trade
- Handle three cases:
  1. **Exact fill** — buy qty == sell qty → both orders consumed
  2. **Partial fill** — one side has leftover quantity → reduced order stays in book
  3. **No match** — best buy < best sell (or a list is empty) → stop
- Recurse until no more matches possible
- Learn: tail recursion, `@tailrec` annotation
- Hint: pattern match on `(buyOrders, sellOrders)` using list head/tail destructuring (`x :: xs`)

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
